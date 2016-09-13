package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];
		Scanner sc = new Scanner( System.in );

		for( int i = 0; i < 3; i++ )
		{
			String line = sc.nextLine();
			String[] infos = line.split(" ");

			String name = infos[0];
			int price = Integer.parseInt( infos[1] );
			int countStock = Integer.parseInt( infos[2] );
			
			Goods goods = new Goods();
			goods.setItem( name );
			goods.setPrice( price );
			goods.setStock( countStock );
			
			goodsArray[i] = goods;			
		}
		
		for( Goods g : goodsArray )
		{
			System.out.println(g.getItem()+"(가격:"+g.getPrice()+"원)이 "
								+g.getStock()+"개 입고 되었습니다.");	
		}
	
		sc.close();
	}
}
