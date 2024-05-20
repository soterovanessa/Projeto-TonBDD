# language: pt

Funcionalidade: Taxa de Juros
	Como uma cliente do app
	Eu quero calcular os juros
	Para aplicar o valor correto
	

Cenário: Calcular Taxa de Juros
	Dado estou no app ton
	Quando digitar o valor que eu quero receber R$ 100
	Então será exibido o valor a cobrar R$ 105


Cenário: Calcular Taxa de Juros parcelado
	Dado estou no app ton
	Quando digitar o valor que eu quero receber 
	E informo que o pagamento vai ser realizado em duas vezez
	Então será exibido o valor correto a cobrar

Cenário: Calcular Valor a receber com prazo de recebimento de trinta dias
	Dado estou no app ton
	Quando digitar o valor que eu quero receber
	E informo o prazo de recebimento de trinta dias
	Então será exibido o valor a receber
