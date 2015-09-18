package br.ufg.inf.es.construcao.avaliacao2;

import org.junit.Assert;
import org.junit.Test;


public class avaliacao2Test {

    @Test
    public void testPrimo() throws Exception {

        Assert.assertTrue(avaliacao2.primo(7));

    }


    @Test
    public void TestPrimo() throws Exception {


        Assert.assertFalse(avaliacao2.primo(288));

    }
}