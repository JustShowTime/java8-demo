package test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author czq
 * @Date 2020-05-28 10:26:22
 *
 */
public class java8Test {
	
	public static void main(String[] args) {
		//计算空字符串,filter
		List<String> strings=Arrays.asList("abc","","bc","efg","abcd","","jkl");
		System.out.println("非空字符串数量："+strings.stream().filter(i ->!i.isEmpty()).count());
		System.out.println("字符串长度为3的数量："+strings.stream().filter(i ->i.length()==3).count());
		
		//删除空字符串,filter
		List<String> stringsNew=strings.stream().filter(i ->!i.isEmpty()).collect(Collectors.toList());
		System.out.println("删除空字符串新的集合元素遍历如下：");
		stringsNew.stream().forEach(System.out::println);
		
		//获取元素统计
		List<Integer> numbers=Arrays.asList(1,2,13,4,15,6,17,8,19);
		IntSummaryStatistics stats=numbers.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("最大数："+stats.getMax());
		System.out.println("最小数："+stats.getMin());
		System.out.println("平均数："+stats.getAverage());
		System.out.println("数量："+stats.getCount());
		System.out.println("总和："+stats.getSum());
		
		//输出10个随机数
		Random random=new Random();
		random.ints(1,100).limit(10).sorted().forEach(System.out::println);
	}
	
	
}
