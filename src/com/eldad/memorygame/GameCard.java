package com.eldad.memorygame;

import android.widget.ImageView;

public class GameCard {
	
	private ImageView _coveredImage;
	private ImageView _unCoveredImage;
	private Integer _currentCardImageNumber;
	private boolean _isCovered;
	
	public GameCard(ImageView coveredImage, ImageView unCoveredImage, Integer currentCardImageNumber, boolean isCovered) {
		_coveredImage = coveredImage;
		_unCoveredImage = unCoveredImage;
		_currentCardImageNumber = currentCardImageNumber;
		_isCovered = isCovered;
		
		_unCoveredImage.setImageResource(_currentCardImageNumber);
	}

	public ImageView GetCoveredImage() {
		return _coveredImage;
	}

	public ImageView GetUnCoveredImage() {
		return _unCoveredImage;
	}

	public Integer GetCurrentCardImageNumber() {
		return _currentCardImageNumber;
	}

	public boolean GetIsCovered() {
		return _isCovered;
	}
	
	public void SwitchCoveredState(){
		_isCovered = !_isCovered;
	}
}