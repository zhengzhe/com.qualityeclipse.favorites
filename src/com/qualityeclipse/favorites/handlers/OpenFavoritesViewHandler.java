package com.qualityeclipse.favorites.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import com.qualityeclipse.favorites.views.FavoriteView;


public class OpenFavoritesViewHandler extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		//TODO:05添加打开视图的相关代码
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window==null) {
			return null;
		}
		
		IWorkbenchPage  activePage = window.getActivePage();
		try {
			activePage.showView(FavoriteView.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

}
