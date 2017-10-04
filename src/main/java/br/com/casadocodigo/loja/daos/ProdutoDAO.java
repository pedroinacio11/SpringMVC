package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Produto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by pedro.inacio on 16/03/2017.
 */

@Repository
@Transactional
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto){

        manager.persist(produto);
    }
}
