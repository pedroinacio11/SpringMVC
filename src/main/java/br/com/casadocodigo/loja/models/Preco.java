package br.com.casadocodigo.loja.models;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * Created by Pedro Henrique on 04/10/2017.
 */

@Embeddable
public class Preco {

    private BigDecimal valor;
    private TipoPreco tipo;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoPreco getTipo() {
        return tipo;
    }

    public void setTipo(TipoPreco tipo) {
        this.tipo = tipo;
    }

}
