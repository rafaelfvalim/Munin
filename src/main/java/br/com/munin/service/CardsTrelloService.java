package br.com.munin.service;

import java.util.ArrayList;
import java.util.List;

import com.julienvey.trello.Trello;
import com.julienvey.trello.domain.Board;
import com.julienvey.trello.domain.Card;
import com.julienvey.trello.impl.TrelloImpl;
import com.julienvey.trello.impl.http.ApacheHttpClient;

import br.com.munin.model.Ticket;

public class CardsTrelloService {
	private String trelloKey = "b233847ba9054d2a499791731aea0a2a";
	private String trelloAccessToken = "3198c5390ef743b2f72a6f3ce638d9f6b06a5029032c3d8af63c0fc932675170";
	private String trelloBoardForAddingCardsId = "ZH1u1lyr";
	Trello trelloApi = null;
	Board board = null;

	public CardsTrelloService() {
		trelloApi = new TrelloImpl(trelloKey, trelloAccessToken, new ApacheHttpClient());
		board = trelloApi.getBoard(trelloBoardForAddingCardsId);
	}

	public List<Ticket> getCards() {
		List<Card> cards = board.fetchCards();
        List<Ticket> tickets = new ArrayList<Ticket>();
        
        
        return tickets;
	}

}
