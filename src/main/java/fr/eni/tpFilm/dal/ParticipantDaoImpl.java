package fr.eni.tpFilm.dal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.eni.tpFilm.bo.Participant;

public class ParticipantDaoImpl {
	
	private List<Participant>participants;
	
	public ParticipantDaoImpl() {
		participants = new ArrayList<>();
		participants.add(new Participant(1, "James", "Cameron")); // Réalisateur de Titanic
	    participants.add(new Participant(2, "Steven", "Spielberg")); // Réalisateur de Jurassic Park
	    participants.add(new Participant(3, "Christopher", "Nolan")); // Réalisateur de The Dark Knight, Inception
	    participants.add(new Participant(4, "Quentin", "Tarantino")); // Réalisateur de Pulp Fiction
	    participants.add(new Participant(5, "Frank", "Darabont")); // Réalisateur de The Shawshank Redemption
	    participants.add(new Participant(6, "Robert", "Zemeckis")); // Réalisateur de Forrest Gump
	    participants.add(new Participant(7, "Peter", "Jackson")); // Réalisateur de The Lord of the Rings: The Fellowship of the Ring
	    participants.add(new Participant(8, "The", "Wachowskis")); // Réalisateurs de The Matrix
	    participants.add(new Participant(9, "Joss", "Whedon")); // Réalisateur de The Avengers
	    participants.add(new Participant(10, "John", "Lasseter")); // Réalisateur de Toy Story
	    participants.add(new Participant(11, "Roger", "Allers")); // Réalisateur de The Lion King
	    participants.add(new Participant(12, "Rob", "Minkoff")); // Réalisateur de The Lion King
	    participants.add(new Participant(13, "David", "Fincher")); // Réalisateur de The Social Network
	    participants.add(new Participant(14, "William", "Friedkin")); // Réalisateur de The Exorcist
	    participants.add(new Participant(15, "Leonardo", "DiCaprio")); // Acteur principal dans Titanic, Inception
	    participants.add(new Participant(16, "Sam", "Neill")); // Acteur dans Jurassic Park
	    participants.add(new Participant(17, "Laura", "Dern")); // Actrice dans Jurassic Park
	    participants.add(new Participant(18, "Jeff", "Goldblum")); // Acteur dans Jurassic Park
	    participants.add(new Participant(19, "Christian", "Bale")); // Acteur dans The Dark Knight
	    participants.add(new Participant(20, "Heath", "Ledger")); // Acteur dans The Dark Knight
	    participants.add(new Participant(21, "Sam", "Worthington")); // Acteur principal dans Avatar
	    participants.add(new Participant(22, "Zoë", "Saldana")); // Actrice dans Avatar
	    participants.add(new Participant(23, "Sigourney", "Weaver")); // Actrice dans Avatar
	    participants.add(new Participant(24, "Joseph", "Gordon-Levitt")); // Acteur dans Inception
	    participants.add(new Participant(25, "Ellen", "Page")); // Actrice dans Inception
	    participants.add(new Participant(26, "John", "Travolta")); // Acteur dans Pulp Fiction
	    participants.add(new Participant(27, "Uma", "Thurman")); // Actrice dans Pulp Fiction
	    participants.add(new Participant(28, "Samuel L.", "Jackson")); // Acteur dans Pulp Fiction
	    participants.add(new Participant(29, "Tim", "Robbins")); // Acteur dans The Shawshank Redemption
	    participants.add(new Participant(30, "Morgan", "Freeman")); // Acteur dans The Shawshank Redemption
	    participants.add(new Participant(31, "Tom", "Hanks")); // Acteur principal dans Forrest Gump
	    participants.add(new Participant(32, "Robin", "Wright")); // Actrice dans Forrest Gump
	    participants.add(new Participant(33, "Gary", "Sinise")); // Acteur dans Forrest Gump
	    participants.add(new Participant(34, "Elijah", "Wood")); // Acteur dans The Lord of the Rings: The Fellowship of the Ring
	    participants.add(new Participant(35, "Ian", "McKellen")); // Acteur dans The Lord of the Rings: The Fellowship of the Ring
	    participants.add(new Participant(36, "Viggo", "Mortensen")); // Acteur dans The Lord of the Rings: The Fellowship of the Ring
	    participants.add(new Participant(37, "Keanu", "Reeves")); // Acteur principal dans The Matrix
	    participants.add(new Participant(38, "Laurence", "Fishburne")); // Acteur dans The Matrix
	    participants.add(new Participant(39, "Carrie-Anne", "Moss")); // Actrice dans The Matrix
	    participants.add(new Participant(40, "Robert", "Downey Jr.")); // Acteur dans The Avengers
	    participants.add(new Participant(41, "Chris", "Evans")); // Acteur dans The Avengers
	    participants.add(new Participant(42, "Scarlett", "Johansson")); // Actrice dans The Avengers
	    participants.add(new Participant(43, "Tim", "Allen")); // Voix d'acteur dans Toy Story
	    participants.add(new Participant(44, "Don", "Rickles")); // Voix d'acteur dans Toy Story
	    participants.add(new Participant(45, "Matthew", "Broderick")); // Voix d'acteur dans The Lion King
	    participants.add(new Participant(46, "James Earl", "Jones")); // Voix d'acteur dans The Lion King
	    participants.add(new Participant(47, "Jeremy", "Irons")); // Voix d'acteur dans The Lion King
	    participants.add(new Participant(48, "Jesse", "Eisenberg")); // Acteur dans The Social Network
	    participants.add(new Participant(49, "Andrew", "Garfield")); // Acteur dans The Social Network
	    participants.add(new Participant(50, "Justin", "Timberlake")); // Acteur dans The Social Network
	    participants.add(new Participant(51, "Linda", "Blair")); // Actrice dans The Exorcist
	    participants.add(new Participant(52, "Ellen", "Burstyn")); // Actrice dans The Exorcist
	    participants.add(new Participant(53, "Max von", "Sydow")); // Acteur dans The Exorcist
	    participants.add(new Participant(54, "Kate", "Winslet")); // Acteur dans Titanic

	}
	
	public Participant findParticipantById(int id) {
		for (Participant participant : participants) {
			if(participant.getId() == id) {
				return participant;
			}
		}
		return null;
	}
}
