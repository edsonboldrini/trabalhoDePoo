package banco;

import main.ConexaoBD;

/**
 *
 * @author garym
 */
public class CategoriaRecurso extends Entidade{
    private int id;
    private String descricao;
    
    public CategoriaRecurso(int i, String d){
        super("SQL VAI AQUI");
        this.id = i;
        this.descricao = d;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
}
