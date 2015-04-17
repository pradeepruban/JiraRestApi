<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title>ISAP User Custom Service Page</title>
		<meta name="description" content="">
		<meta name="author" content="">	
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">

		<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production-plugins.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.min.css">

		<!-- SmartAdmin RTL Support -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> 

		<!-- #FAVICONS syntel logo -->
		<link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">

		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/demo.min.css">

		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
	
	</head>
	   
    <body class="">
    
		<!-- #HEADER -->
		<header id="header">
		<!-- PAGE LOGO HEADER -->

		<%@ include file="/includefiles/logoheader.jsp"%>

		<!-- END PAGE LOGO HEADER -->

		<!-- #TOGGLE LAYOUT BUTTONS -->
			<!-- pulled right: nav area -->
			<div class="pull-right">

               <div class="project-context hidden-xs">
                <span class="label">Tenant User: ( Project : STG Automtation Team )</span>
                 <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                    <i class="fa fa-user"></i>
                        <span> Welcome ,&nbsp;&nbsp;${userValue.usr_name}</span>
                 </a>
               </div>
               
               	<!-- collapse menu button -->
				<div id="hide-menu" class="btn-header pull-right">
					<span> <a href="javascript:void(0);" data-action="toggleMenu" title="Collapse Menu"><i class="fa fa-reorder"></i></a> </span>
				</div>
				<!-- end collapse menu -->

              <span> <a style="border-radius: 2px;cursor: default !important;display: inline-block;font-weight: 700;height: 30px;line-height: 24px;min-width: 30px;
                                padding: 2px;text-align: center;text-decoration: none !important;-moz-user-select: none;background-color: #F8F8F8;
                                background-image: -moz-linear-gradient(center top , #F8F8F8, #F1F1F1);border: 1px solid #BFBFBF;color: #6D6A69;font-size: 17px;
                                margin: 10px 0px 0px;" href="./logOut.jsp" title="Sign Out" data-action="userLogout" 
                                data-logout-msg="You can improve your security further after logging out by closing this opened browser">
                           <i class="fa fa-sign-out"></i>
                       </a> 
             </span> 

           </div>
			<!-- end pulled right: nav area -->

		</header>
		<!-- END HEADER -->

		<aside id="left-panel">

			<!-- NAVIGATION : This navigation is also responsive-->
			<nav>
			
				<ul>				
					<li class="active">
						<a href="#"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Project Template</span></a>
					</li>		
					<li  >
						<a href="addIssue.jsp"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Issue Template</span></a>
					</li>							
				</ul>
			</nav>
			<span class="minifyme" data-action="minifyMenu"> 
				<i class="fa fa-arrow-circle-left hit"></i> 
			</span>
		</aside>
		<!-- END NAVIGATION -->

		<!-- MAIN PANEL -->
		<div id="main" role="main">
			<!-- RIBBON -->
			<div id="ribbon">
				<span class="ribbon-button-alignment"> 
				<%-- 	<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span>  --%>
				</span>
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Project Template</li>
				</ol>
			</div>
			<!-- END RIBBON -->

	<!-- MAIN CONTENT -->
<div id="content">

	<!-- widget grid -->
				<section id="widget-grid" class="">
				
					<!-- row -->
				 <div class="row"> 
					
					
	              	
				 <div class="pull-center"> 
					
					
					<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4 ">
						<h1 class="page-title txt-color-blueDark">
	
			
			<!-- PAGE HEADER -->
			
		<!-- 	<span>
				<h1>Add Project</h1>
			</span> -->
	  	</h1>
					</div>
					
					<!-- end col -->
				</div>
				<br><br>
				<!-- end row -->
					
				
						<!-- NEW WIDGET START -->
		<!-- 			
					<article class="col-sm-5 col-md-12 col-lg-6">
				
							Widget ID (each widget will need unique ID)
							<div class="jarviswidget" id="wid-id-11" data-widget-colorbutton="false" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false">
								widget options:
								usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
				
								data-widget-colorbutton="false"
								data-widget-editbutton="false"
								data-widget-togglebutton="false"
								data-widget-deletebutton="false"
								data-widget-fullscreenbutton="false"
								data-widget-custombutton="false"
								data-widget-collapsed="true"
								data-widget-sortable="false"
				
								
								
				
								
				
									
									<div class="widget-body ">
				
										<form class="form-horizontal" action="addProject" method="POST">
											
											<fieldset>
												
												
												
												<div class="form-group">
													 <label class="col-md-4 control-label">Project Name</label>
													  <div class="col-md-4">
														<label class="input">
															<input type="text" id="proj_name" name="proj_name"  required>
														</label>
																	
													  </div>
												</div>
												<div class="form-group">
													 <label class="col-md-4 control-label">Project key</label>
													  <div class="col-md-4">
														<label class="input">
															<input type="text" id="proj_key" name="proj_key" style="text-transform: uppercase;" required>
														</label>
																	
													  </div>
												</div>
												<div class="form-group">
													 <label class="col-md-4 control-label">Project Description</label>
													  <div class="col-md-4">
														<label class="input">
															<input type="text" name="proj_desc" >
														</label>
																	
													  </div>
												</div>
												<div class="form-group">
													 <label class="col-md-4 control-label">Project URL </label>
													  <div class="col-md-4">
														<label class="input">
															<input type="text" name="proj_url" >
														</label>
																	
													  </div>
												</div>
												<div class="form-group">
													 <label class="col-md-4 control-label">Project Lead</label>
													  <div class="col-md-4">
														<label class="input">
															<input type="text" name="proj_lead" >
														</label>
																	
													  </div>
												</div>
												
											</fieldset>
												
												
												
												<footer>
										       	<div>
													<h3 class="margin-top-0">
									  	
									  					<button type="submit" class="btn btn-primary" id="addproject" >
									                     Add Project
							                           	</button>
													</h3> 
												</div>
												</footer>
											
											
											
				    					</form>
											
									WIDGET END
 									</div>
							</div>
							
						</article>					
									 -->	
									 
									 <article class="col-sm-12 col-md-12 col-lg-12">
			
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-5" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
		
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
					<h2>Project Details </h2>				
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding smart-form">
						<form class="form-horizontal" action="addProject" method="POST">
							<fieldset>
								<div class="row">
						             <section class="col col-4">
												<label class="label">Project Name </label>
												<label class="input">
													<input type="text" id="proj_name" name="proj_name"  required>
												</label>
											</section>
					                         <section class="col col-4">
					                                 <label class="label">Project key </label>
															<label class="input"> 
																<input type="text" id="proj_key" name="proj_key"  required>
															</label>
												</section>
												<section class="col col-4">
														   <label class="label">Project Description</label>
															<label class="input">
																<input type="text" name="proj_desc" >
															</label>
												</section>
								         </div>
								
								
							<div class="row">
						             <section class="col col-4">
												<label class="label">Project URL</label>
												<label class="input">
													<input type="text" name="proj_url" >
												</label>
											</section>
					                         <section class="col col-4">
					                                 <label class="label">Project Lead</label>
															<label class="input"> 
																<input type="text" id="proj_lead" name="proj_lead"  required>
															</label>
												</section>
												
								         </div>
								

							</fieldset>
							
							<footer>
								<button type="submit" class="btn btn-primary">
									Add Project
								</button>
							</footer>
                      </form>
					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
			<!-- end widget -->
			
	

		</article>	
			</div>
			</section>						

</div>
<!-- END MAIN CONTENT -->

</div>
<!-- END MAIN PANEL -->


	<!-- PAGE FOOTER -->

	<%@ include file="/includefiles/footer.jsp"%>

	<!-- END PAGE FOOTER -->


	<!--================================================== -->

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script data-pace-options='{ "restartOnRequestAfter": true }' src="js/plugin/pace/pace.min.js"></script>

		<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<script>
			if (!window.jQuery) {
				document.write('<script src="js/libs/jquery-2.1.1.min.js"><\/script>');
			}
		</script>

		<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
		<script>
			if (!window.jQuery.ui) {
				document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');
			}
		</script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src="js/app.config.js"></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> 

		<!-- BOOTSTRAP JS -->
		<script src="js/bootstrap/bootstrap.min.js"></script>

		<!-- CUSTOM NOTIFICATION -->
		<script src="js/notification/SmartNotification.min.js"></script>

		<!-- JARVIS WIDGETS -->
		<script src="js/smartwidgets/jarvis.widget.min.js"></script>

		<!-- EASY PIE CHARTS -->
		<script src="js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>


		<!-- SPARKLINES -->
		<script src="js/plugin/sparkline/jquery.sparkline.min.js"></script>

		<!-- JQUERY textIDATE -->
		<script src="js/plugin/jquery-textidate/jquery.textidate.min.js"></script>

		<!-- JQUERY MASKED INPUT -->
		<script src="js/plugin/masked-input/jquery.maskedinput.min.js"></script>

		<!-- JQUERY SELECT2 INPUT -->
		<script src="js/plugin/select2/select2.min.js"></script>

		<!-- JQUERY UI + Bootstrap Slider -->
		<script src="js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

		<!-- browser msie issue fix -->
		<script src="js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

		<!-- FastClick: For mobile devices -->
		<script src="js/plugin/fastclick/fastclick.min.js"></script>

		<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->


		<!-- MAIN APP JS FILE -->
		<script src="js/app.min.js"></script>
		
		<!-- JQUERY VALIDATE -->
		<script src="js/plugin/jquery-validate/jquery.validate.min.js"></script>



		<!-- PAGE RELATED PLUGIN(S) 
		<script src="..."></script>-->
		<!-- PAGE RELATED PLUGIN(S) -->
		<script src="js/plugin/datatables/jquery.dataTables.min.js"></script>
		<script src="js/plugin/datatables/dataTables.colVis.min.js"></script>
		<script src="js/plugin/datatables/dataTables.tableTools.min.js"></script>
		<script src="js/plugin/datatables/dataTables.bootstrap.min.js"></script>
		<script src="js/plugin/datatable-responsive/datatables.responsive.min.js"></script>
	
		<script type="text/javascript">
		$(document).ready(function() {
			

    	    $('#proj_name').change(function() {
    	        this.value = this.value.toUpperCase();
    	        alert(this.value);
    	    });
        
    	    $('#proj_key').change(function(){
    	    	 this.value = this.value.toUpperCase();
	    	      alert(this.value);
    	    });
			pageSetUp();
			
			/* // DOM Position key index //
		
			l - Length changing (dropdown)
			f - Filtering input (search)
			t - The Table! (datatable)
			i - Information (records)
			p - Pagination (paging)
			r - pRocessing 
			< and > - div elements
			<"#id" and > - div with an id
			<"class" and > - div with a class
			<"#id.class" and > - div with an id and class
			
			Also see: http://legacy.datatables.net/usage/features
			*/	
	
			/* BASIC ;*/
				var responsiveHelper_dt_basic = undefined;
				var responsiveHelper_datatable_fixed_column = undefined;
				var responsiveHelper_datatable_col_reorder = undefined;
				var responsiveHelper_datatable_tabletools = undefined;
				
				var breakpointDefinition = {
					tablet : 1024,
					phone : 480
				};
	
				$('#dt_basic').dataTable({
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
					"autoWidth" : true,
					 "bSort": true,
					
					"preDrawCallback" : function() {
						// Initialize the responsive datatables helper once.
						if (!responsiveHelper_dt_basic) {
							responsiveHelper_dt_basic = new ResponsiveDatatablesHelper($('#dt_basic'), breakpointDefinition);
						}
					},
					"rowCallback" : function(nRow) {
						responsiveHelper_dt_basic.createExpandIcon(nRow);
					},
					"drawCallback" : function(oSettings) {
						responsiveHelper_dt_basic.respond();
					}
				});
	
			/* END BASIC */
			
			
		})

		</script>

		<!-- Your GOOGLE ANALYTICS CODE Below -->
		<script type="text/javascript">
			var _gaq = _gaq || [];
			_gaq.push(['_setAccount', 'UA-XXXXXXXX-X']);
			_gaq.push(['_trackPageview']);
			
			(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
			})();
		</script>
		});    
		</script>
	</body>
</html>