package entities;

import enums.StatusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private Cliente cliente;

    private LocalDateTime momento;
    private StatusPedido status;


    public Pedido() {
    }

    public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.itens = itens;
        this.cliente = cliente;
    }

    public Pedido(LocalDateTime momento, StatusPedido status, List<ItemPedido> itens, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.itens = itens;
        this.cliente = cliente;
    }


    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItens(ItemPedido itemPedido) {
        itens.add(itemPedido);
    }

    public void removerItens(ItemPedido itemPedido) {
        itens.remove(itemPedido);
    }

    public Double total() {
        Double soma = 0.0;
        for (ItemPedido item : itens) {
            soma += item.valorTotal();
        }

        return soma;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        StringBuilder sb = new StringBuilder();
        sb.append("Data do pedido: " + momento.format(fmt));
        sb.append("\nStatus do pedido: " + status);
        sb.append(getCliente());
        sb.append("\n Itens do pedido: \n");
        for (ItemPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("Total do pedido: $ " + String.format("%.2f", total()));
        return sb.toString();
    }
}

