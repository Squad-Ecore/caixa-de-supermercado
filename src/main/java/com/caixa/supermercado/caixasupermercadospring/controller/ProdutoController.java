package com.caixa.supermercado.caixasupermercadospring.controller;

import com.caixa.supermercado.caixasupermercadospring.dto.ProdutoDto;
import com.caixa.supermercado.caixasupermercadospring.form.AtualizaProdutoForm;
import com.caixa.supermercado.caixasupermercadospring.form.ProdutoForm;
import com.caixa.supermercado.caixasupermercadospring.model.Produto;
import com.caixa.supermercado.caixasupermercadospring.repository.CategoriaRepository;
import com.caixa.supermercado.caixasupermercadospring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<ProdutoDto> listarProdutos(String nomeCategoria){
        if(nomeCategoria == null){
            List<Produto> produtos = produtoRepository.findAll();
            return ProdutoDto.conversorDeLista(produtos);
        } else{
            List<Produto> produtos = produtoRepository.findByCategoriaNome(nomeCategoria);
            return ProdutoDto.conversorDeLista(produtos);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDto> buscarProdutoPorId(@PathVariable Long id){
        Optional<Produto> optional = produtoRepository.findById(id);
        if (optional.isPresent()){
            return ResponseEntity.ok(new ProdutoDto(optional.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<ProdutoDto> cadastrarProduto(@RequestBody @Valid ProdutoForm form, UriComponentsBuilder uriBuilder){
        Produto produto = form.conversor(categoriaRepository);
        produtoRepository.save(produto);
        URI uri = uriBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).body(new ProdutoDto(produto));//created recebe URI
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<ProdutoDto> atualizarProduto(@PathVariable("id") Long id, @RequestBody @Valid AtualizaProdutoForm form){
        Optional<Produto> optional = produtoRepository.findById(id);
        if (optional.isPresent()){
            Produto produto = form.atualizaProduto(id, produtoRepository);
            return ResponseEntity.ok(new ProdutoDto(produto));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> detetarProduto(@PathVariable Long id){
        Optional<Produto> optional = produtoRepository.findById(id);
        if (optional.isPresent()){
            produtoRepository.deleteById(id);
            return ResponseEntity.ok().build();//sempre no final de todoResponseEntity tem que ter build
        }
        return ResponseEntity.notFound().build();
    }
}
