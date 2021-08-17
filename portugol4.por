
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real ladox, ladoy, ladoz
		escreva ("informe o lado x: ")
		leia(ladox)
		escreva ("informe o lado y: ")
		leia(ladoy)
		escreva ("informe o lado z: ")
		leia(ladoz)
		{
		se (ladox == 0 ou ladoy == 0 ou ladoz == 0){
			escreva("Não é um triangulo")
		}
		
		senao
		
		}
		se (ladox==ladoy e ladox==ladoz e ladoy==ladoz){  
		     escreva("\n","É um triangulo Equilátero")
		}
		se (ladox==ladoy e ladox!=ladoz){
			escreva("\n","É um triangulo Isósceles") 
		}
	     se (ladox==ladoz e ladoy!=ladoz){ 
	     	escreva("\n","É um triangulo Isósceles") 
	     }
	     se (ladoy==ladoz e ladoy!=ladox) {
	     	escreva("\n","É um triangulo Isósceles")
	     }
	     se (ladox!=ladoy e ladox!=ladoz e ladoy!=ladoz){
	     	escreva ("\n","É um triangulo Escaleno")
	     }
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */