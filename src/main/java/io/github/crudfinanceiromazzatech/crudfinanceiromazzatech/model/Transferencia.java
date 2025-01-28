package io.github.crudfinanceiromazzatech.CrudFinanceiroMazzatech.model;

public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 10, max = 10)
    private String contaOrigem;

    @NotBlank
    @Size(min = 10, max = 10)
    private String contaDestino;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal valor;

    @DecimalMin(value = "0.00")
    private BigDecimal taxa;

    @NotNull
    private LocalDate dataTransferencia;

    @NotNull
    private LocalDate dataAgendamento;

// Getters e Setters

    public String Id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaorigem) {
        this.contaorigem = contaorigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contadestino) {
        this.contadestino = contadestino;
    }
}
