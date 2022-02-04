package pilha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    Pilha pilha;
    @BeforeEach
    void setup() {
        pilha = new Pilha(3);
    }

    @Test
    void deveInserirTresElementosNaPilha() {
        pilha.stack_push("Oi");
        pilha.stack_push("Eae");
        pilha.stack_push("Enois");

        assertEquals("Oi\nEae\nEnois", pilha.stack_print());
    }

    @Test
    void deveDesempilharComSucesso() {
        pilha.stack_push("Oi");
        assertEquals("Oi", pilha.stack_pop());
    }

    @Test
    void deveFalharDesempilhaPilhaVazia() {
        assertEquals("", pilha.stack_pop());
    }

    @Test
    void deveVerificarItemExistenteERetornarPosicao() {
        pilha.stack_push("Oi");
        pilha.stack_push("Hi");
        assertEquals(1, pilha.stack_verify("Hi"));
    }

    @Test
    void deveFalharVerificaItemInexistente(){
        assertEquals(-1, pilha.stack_verify("Oi"));
    }

    @Test
    void deveDesempilharAteAcabar() {
        pilha.stack_push("Oi");
        pilha.stack_push("Hi");

        pilha.stack_pop();
        pilha.stack_pop();

        assertEquals("", pilha.stack_pop());
    }

}