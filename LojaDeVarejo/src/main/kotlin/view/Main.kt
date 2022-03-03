package view

import model.Tipo

fun main() {
    val clienteController = controller.Cliente()
    val cliente = clienteController.clienteFactory(
        nome = "Adryan Maikel",
        cpf = "862.568.759-19",
        endereco = "Rua Banana Quadrada, 568"
    )


    val vendedorController = controller.Vendedor()
    val vendedor = vendedorController.vendedorFactory(
        nome = "Ricardo da Silva",
        cpf = "856.569.856-20",
    )

    val fornecedorController = controller.Fornecedor()
    val fornecedor = fornecedorController.fornecedorFactory(
        nomeFantasia = "Via Láctea",
        razaoSocial = "VIA LACTEA LTDA",
        cnpj = "07.784.369/0001-81",
    )

    val transportadoraController = controller.Transportadora()
    val transportadora = transportadoraController.transportadoraFactory(
        nomeFantasia = "Express",
        razaoSocial = "Express LTDA",
        cnpj = "00.810.559/0075-13",
        endereco = "Rua da Graça, 535",
    )
    print(transportadora)

    val produtoController = controller.Produto()
    val produto = produtoController.produtoFactory(
        nome = "Calça",
        tipo = Tipo.ROUPA,
        preco = 10,
    )

    val vendaController = controller.Venda()
    val venda = vendaController.vendaFactory(
        produto = produto,
        quantidade = 1,
        cliente = cliente,
        fornecedor = fornecedor,
        vendedor = vendedor,
    )
    print(venda)
}
