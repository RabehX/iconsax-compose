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

package io.github.rabehx.iconsax.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.Pipette: ImageVector
    get() {
        if (_Pipette != null) {
            return _Pipette!!
        }
        _Pipette = ImageVector.Builder(
            name = "Filled.Pipette",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveToRelative(10.241f, 5.753f)
                lineToRelative(8.006f, 8.006f)
                arcToRelative(1.544f, 1.544f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.183f, -2.184f)
                lineToRelative(-1.091f, -1.091f)
                lineToRelative(1.455f, -1.456f)
                arcToRelative(4.117f, 4.117f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.822f, -5.822f)
                lineTo(13.516f, 4.66f)
                lineToRelative(-1.091f, -1.09f)
                arcToRelative(1.544f, 1.544f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.184f, 2.183f)
                moveToRelative(0.031f, 2.152f)
                lineTo(4.71f, 13.47f)
                curveToRelative(-0.456f, 0.456f, -0.684f, 0.684f, -0.829f, 0.957f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, 0.58f)
                curveToRelative(-0.058f, 0.304f, -0.022f, 0.624f, 0.049f, 1.265f)
                lineToRelative(0.053f, 0.476f)
                curveToRelative(0.02f, 0.175f, 0.029f, 0.262f, 0.031f, 0.346f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.488f, 1.392f)
                curveToRelative(-0.054f, 0.064f, -0.117f, 0.126f, -0.241f, 0.25f)
                lineToRelative(-0.629f, 0.63f)
                arcToRelative(1.544f, 1.544f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.184f, 2.183f)
                lineToRelative(0.628f, -0.629f)
                curveToRelative(0.125f, -0.124f, 0.187f, -0.187f, 0.25f, -0.24f)
                curveToRelative(0.389f, -0.33f, 0.885f, -0.504f, 1.393f, -0.49f)
                curveToRelative(0.084f, 0.003f, 0.171f, 0.013f, 0.346f, 0.032f)
                lineToRelative(0.476f, 0.053f)
                curveToRelative(0.64f, 0.071f, 0.961f, 0.107f, 1.265f, 0.05f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.58f, -0.204f)
                curveToRelative(0.273f, -0.145f, 0.501f, -0.373f, 0.957f, -0.829f)
                lineToRelative(1.439f, -1.439f)
                lineTo(10.116f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(1.854f, 1.853f)
                lineToRelative(0.94f, -0.94f)
                lineTo(12.116f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(1.854f, 1.853f)
                lineToRelative(1.065f, -1.064f)
                close()
            }
        }.build()

        return _Pipette!!
    }

@Suppress("ObjectPropertyName")
private var _Pipette: ImageVector? = null
