package aula46;

public interface BancoDados extends SqlDDl, SqlDCL, SqlDML{
    void abrirConexao();
    void fecharConexao();
}
