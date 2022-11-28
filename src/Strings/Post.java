package Strings;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	public static 	SimpleDateFormat dataEmTexto = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String titulo;
	private String coment;
	private Integer curtidas;
	
	private List<Comentarios> comentarios = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String titulo, String coment, Integer curtidas) {
		this.moment = moment;
		this.titulo = titulo;
		this.coment = coment;
		this.curtidas = curtidas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return coment;
	}

	public void setComentario(String comentario) {
		this.coment = comentario;
	}
	
	public Date getMoment() {
		return moment;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void addComentario(Comentarios c) {
		comentarios.add(c);
	}
	
	public void removerComentario(Comentarios c) {
		comentarios.remove(c);
	}
	
	//String Builder é indicado quando vc precisa agrupar um 
	//conjunto de strings evitando o uso execivo de concatenação
	// apende adicione ao final da String
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n" );
		sb.append(curtidas);
		sb.append(" Curtidas - " );
		sb.append(dataEmTexto.format(moment) +"\n" );
		sb.append(coment + "\n" );
		sb.append("Comentários:\n");
		for (Comentarios c : comentarios) {
			sb.append(c.getTexto()+"\n");
		}
		
		return sb.toString();
		
		/*return "Momento: "+ getMoment() + 
				"\nTítulo: "+ getTitulo() +
				"\nComentario: "+ getComentario()+
				"\nCurtidas: " + getCurtidas();*/
		
	}
	
}
