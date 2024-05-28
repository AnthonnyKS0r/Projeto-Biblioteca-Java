public class Livro extends Produto
{

    private int quant_paginas;
    private String genero;
    private int ano;
    private String autor;
    private String editora;

  public Livro(String nome_produto, String descricao, String genero, String autor, String editora, int estoque,int quant_paginas,int ano, float preco)
  {
      super(nome_produto,descricao,estoque,preco);

      this.quant_paginas = quant_paginas;
      this.genero = genero;
      this.ano = ano;
      this.autor = autor;
      this.editora = editora;
  }

  public void setquant_paginas(int quant_paginas)
  {
      this.quant_paginas = quant_paginas;
  }

  public int getquant_paginas()
  {
      return quant_paginas;
  }

  public void setgenero(String genero)
  {
      this.genero = genero;
  }

  public String getgenero()
  {
      return genero;
  }

  public void setano (int ano)
  {
      this.ano = ano;
  }

  public int getano()
  {
      return ano;
  }

  public void setautor(String autor)
  {
      this.autor = autor;
  }

  public String getautor()
  {
      return autor;
  }

  public void seteditora(String editora)
  {
      this.editora = editora;
  }

  public String geteditora()
  {
      return editora;
  }



}
