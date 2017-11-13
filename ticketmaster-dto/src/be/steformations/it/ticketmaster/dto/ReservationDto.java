package be.steformations.it.ticketmaster.dto;

@javax.xml.bind.annotation.XmlRootElement(name="reservation")
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ReservationDto implements java.io.Serializable{

	private static final long serialVersionUID = -2815713522332767557L;
	protected Integer id;	
	protected EvenementDto evenement;
	protected ClientDto client;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EvenementDto getEvenement() {
		return evenement;
	}
	public void setEvenement(EvenementDto evenement) {
		this.evenement = evenement;
	}
	public ClientDto getClient() {
		return client;
	}
	public void setClient(ClientDto client) {
		this.client = client;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((evenement == null) ? 0 : evenement.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservationDto other = (ReservationDto) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (evenement == null) {
			if (other.evenement != null)
				return false;
		} else if (!evenement.equals(other.evenement))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReservationDto [id=" + id + ", evenement=" + evenement + ", client=" + client + "]";
	}
	
	
}
