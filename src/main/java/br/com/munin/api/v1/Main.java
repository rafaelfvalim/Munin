package br.com.munin.api.v1;

import java.util.List;

import com.julienvey.trello.Trello;
import com.julienvey.trello.domain.Board;
import com.julienvey.trello.domain.Card;
import com.julienvey.trello.domain.TList;
import com.julienvey.trello.impl.TrelloImpl;
import com.julienvey.trello.impl.http.ApacheHttpClient;

public class Main {

	public static void main(String[] args) {

		String trelloKey = "b233847ba9054d2a499791731aea0a2a";
		String trelloAccessToken = "3198c5390ef743b2f72a6f3ce638d9f6b06a5029032c3d8af63c0fc932675170";

		String trelloBoardForAddingCardsId = "ZH1u1lyr";
		Trello trelloApi = new TrelloImpl(trelloKey, trelloAccessToken, new ApacheHttpClient());
		Board board = trelloApi.getBoard(trelloBoardForAddingCardsId);
		
		
		
		List<TList> lists = board.fetchLists();
		
		List<Card>cards =  board.fetchCards();
//		
//		
//		for (Card card : cards) {
//			System.out.println(card.getName());
//			System.out.println(card.get());
//
//		}
//		
//		for (TList tList : lists) {
//
//			System.out.println(tList.getId());
//			System.out.println(tList.getName());
//			TList list2 = trelloApi.getList(tList.getId());		
//			
//			for (Card card : list2.getCards()) {
//				System.out.println(card.getName());
//			}
//			
//			
//			
//			
//		}

//		Card card = new Card();
//		card.setName("TESTE ");
//		card.setDesc("Esse card é de teste");
//		card.setPos(1);
////		card.setDue(new Date());
//		card.setIdList("5be423a5b09ab72ff8de93d0");
//	Card card2 = trelloApi.createCard("5be423a5b09ab72ff8de93d0", card);
//	System.out.println(card2.getId());
	}

}
