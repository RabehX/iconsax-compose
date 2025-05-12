/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.SlashSquare: ImageVector
    get() {
        if (_SlashSquare != null) {
            return _SlashSquare!!
        }
        _SlashSquare = ImageVector.Builder(
            name = "Outline.SlashSquare",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.018f, 7.365f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.449f, -0.389f)
                lineToRelative(-2.588f, 9.66f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.45f, 0.388f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.943f, 1.25f)
                curveToRelative(-2.309f, 0f, -4.118f, 0f, -5.53f, 0.19f)
                curveToRelative(-1.444f, 0.194f, -2.584f, 0.6f, -3.479f, 1.494f)
                curveToRelative(-0.895f, 0.895f, -1.3f, 2.035f, -1.494f, 3.48f)
                curveToRelative(-0.19f, 1.411f, -0.19f, 3.22f, -0.19f, 5.529f)
                verticalLineToRelative(0.114f)
                curveToRelative(0f, 2.309f, 0f, 4.118f, 0.19f, 5.53f)
                curveToRelative(0.194f, 1.444f, 0.6f, 2.584f, 1.494f, 3.479f)
                curveToRelative(0.895f, 0.895f, 2.035f, 1.3f, 3.48f, 1.494f)
                curveToRelative(1.411f, 0.19f, 3.22f, 0.19f, 5.529f, 0.19f)
                horizontalLineToRelative(0.114f)
                curveToRelative(2.309f, 0f, 4.118f, 0f, 5.53f, -0.19f)
                curveToRelative(1.444f, -0.194f, 2.584f, -0.6f, 3.479f, -1.494f)
                curveToRelative(0.895f, -0.895f, 1.3f, -2.035f, 1.494f, -3.48f)
                curveToRelative(0.19f, -1.411f, 0.19f, -3.22f, 0.19f, -5.529f)
                verticalLineToRelative(-0.114f)
                curveToRelative(0f, -2.309f, 0f, -4.118f, -0.19f, -5.53f)
                curveToRelative(-0.194f, -1.444f, -0.6f, -2.584f, -1.494f, -3.479f)
                curveToRelative(-0.895f, -0.895f, -2.035f, -1.3f, -3.48f, -1.494f)
                curveToRelative(-1.411f, -0.19f, -3.22f, -0.19f, -5.529f, -0.19f)
                close()
                moveTo(3.995f, 3.995f)
                curveToRelative(0.57f, -0.57f, 1.34f, -0.897f, 2.619f, -1.069f)
                curveToRelative(1.3f, -0.174f, 3.008f, -0.176f, 5.386f, -0.176f)
                reflectiveCurveToRelative(4.086f, 0.002f, 5.386f, 0.176f)
                curveToRelative(1.279f, 0.172f, 2.05f, 0.5f, 2.62f, 1.069f)
                curveToRelative(0.569f, 0.57f, 0.896f, 1.34f, 1.068f, 2.619f)
                curveToRelative(0.174f, 1.3f, 0.176f, 3.008f, 0.176f, 5.386f)
                reflectiveCurveToRelative(-0.002f, 4.086f, -0.176f, 5.386f)
                curveToRelative(-0.172f, 1.279f, -0.5f, 2.05f, -1.069f, 2.62f)
                curveToRelative(-0.57f, 0.569f, -1.34f, 0.896f, -2.619f, 1.068f)
                curveToRelative(-1.3f, 0.174f, -3.008f, 0.176f, -5.386f, 0.176f)
                reflectiveCurveToRelative(-4.086f, -0.002f, -5.386f, -0.176f)
                curveToRelative(-1.279f, -0.172f, -2.05f, -0.5f, -2.62f, -1.069f)
                curveToRelative(-0.569f, -0.57f, -0.896f, -1.34f, -1.068f, -2.619f)
                curveToRelative(-0.174f, -1.3f, -0.176f, -3.008f, -0.176f, -5.386f)
                reflectiveCurveToRelative(0.002f, -4.086f, 0.176f, -5.386f)
                curveToRelative(0.172f, -1.279f, 0.5f, -2.05f, 1.069f, -2.62f)
            }
        }.build()

        return _SlashSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SlashSquare: ImageVector? = null
