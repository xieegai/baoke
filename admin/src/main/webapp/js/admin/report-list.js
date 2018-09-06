	Ext.require([
        'Ext.form.*',
	    'Ext.tip.QuickTipManager'
	]);

var testTab;

Ext.onReady(function() {
	
	reportListTab = function(){
		var reportListTab = Ext.getCmp("report_List_Tab");
		if(reportListTab==null){
			Ext.getCmp("body_panel").add({
				xtype:'panel',
				id:'report_List_Tab',
				height:'100%',
				width:'100%',
				title:'举报管理',
				layout:'fit',
		        closable: true,
	            buttonAlign:'center',
	            fitToFrame: true, 
                items: [{
                	html: '<iframe id="frame1" src="index?path=/admin/report-list" frameborder="0" width="100%" height="100%"></iframe>' 
                }]
			}).show();
		}else{
			indexInfoTab.show();
		}
	}
	
});