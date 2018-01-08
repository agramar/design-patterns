package kr.co.agramar.iterator.exam01;

// 하나씩 나열하면서 검색을 실행하는 인터페이스
public interface Iterator {
	// 다음 요소가 존재하는지 조사
	public abstract boolean hasNext();
	
	// 다음 요소를 얻기 위한 메소드
	public abstract Object next();
}
