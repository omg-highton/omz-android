package com.minjae.highthon.root

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

fun NavGraphBuilder.boardNavigation(
    navController: NavController
) {
    /*navigation(
        startDestination = NavGroup.OnBoarding.SIGN_IN,
        route = NavGroup.OnBoarding.group
    ) {

        composable(NavGroup.OnBoarding.SIGN_IN) {
            SignInScreen(navController = navController, signInVm = hiltViewModel())
        }

        composable(
            route = NavGroup.Boarding.REPORT_DETAIL + "?thesisId={thesisId}",
            arguments = listOf(
                navArgument(name = "thesisId") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) {
            val thesisId = it.arguments?.getString("thesisId") ?: ""
            ReportDetailScreen(
                navController = navController,
                reportDetailVM = hiltViewModel(),
                thesisId = thesisId
            )
        }

    }*/
}
