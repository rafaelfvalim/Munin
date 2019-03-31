package br.com.munin.enums;

public enum StatusTicket {
	  ABERTO {
	      public String toString() {
	          return "Aberto";
	      }
	  },
	  FECHADO {
		  public String toString() {
			  return "Fechado";
		  }
	  },
	  AGUARDANDO_CLIENTE {
		  public String toString() {
			  return "Aguardando Cliente";
		  }
	  },
	  AGUARDANDO {
		  public String toString() {
			  return "Aguardando";
		  }
	  },
	  REABERTO {
		  public String toString() {
			  return "Reaberto";
		  }
	  },
}
