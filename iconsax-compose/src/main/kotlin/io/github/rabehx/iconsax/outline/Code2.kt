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

val Iconsax.Outline.Code2: ImageVector
    get() {
        if (_Code2 != null) {
            return _Code2!!
        }
        _Code2 = ImageVector.Builder(
            name = "Outline.Code2",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.558f, 4.328f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.056f, 1.06f)
                lineTo(6.805f, 6.913f)
                curveToRelative(-0.788f, 0.709f, -1.319f, 1.19f, -1.663f, 1.598f)
                curveToRelative(-0.33f, 0.393f, -0.402f, 0.622f, -0.402f, 0.818f)
                reflectiveCurveToRelative(0.072f, 0.424f, 0.402f, 0.817f)
                curveToRelative(0.344f, 0.409f, 0.875f, 0.89f, 1.663f, 1.598f)
                lineToRelative(1.697f, 1.527f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.004f, 1.115f)
                lineToRelative(-1.737f, -1.564f)
                curveToRelative(-0.737f, -0.662f, -1.347f, -1.212f, -1.767f, -1.71f)
                curveToRelative(-0.44f, -0.525f, -0.754f, -1.088f, -0.754f, -1.783f)
                curveToRelative(0f, -0.696f, 0.313f, -1.259f, 0.754f, -1.783f)
                curveToRelative(0.42f, -0.499f, 1.03f, -1.048f, 1.767f, -1.711f)
                lineToRelative(0.04f, -0.037f)
                lineToRelative(1.697f, -1.527f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.056f)
                moveToRelative(5.622f, -0.053f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.532f, 0.918f)
                lineToRelative(-3.987f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.45f, -0.386f)
                lineToRelative(3.987f, -15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.918f, -0.532f)
                moveToRelative(1.263f, 6.223f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.059f, -0.055f)
                lineToRelative(1.737f, 1.563f)
                curveToRelative(0.737f, 0.663f, 1.347f, 1.213f, 1.767f, 1.711f)
                curveToRelative(0.44f, 0.524f, 0.754f, 1.088f, 0.754f, 1.783f)
                reflectiveCurveToRelative(-0.313f, 1.259f, -0.754f, 1.783f)
                curveToRelative(-0.42f, 0.498f, -1.03f, 1.048f, -1.767f, 1.71f)
                lineToRelative(-1.737f, 1.565f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.004f, -1.116f)
                lineToRelative(1.697f, -1.526f)
                curveToRelative(0.788f, -0.71f, 1.319f, -1.19f, 1.663f, -1.599f)
                curveToRelative(0.33f, -0.392f, 0.402f, -0.622f, 0.402f, -0.817f)
                reflectiveCurveToRelative(-0.072f, -0.425f, -0.402f, -0.817f)
                curveToRelative(-0.344f, -0.41f, -0.875f, -0.89f, -1.663f, -1.599f)
                lineToRelative(-1.697f, -1.527f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.055f, -1.059f)
            }
        }.build()

        return _Code2!!
    }

@Suppress("ObjectPropertyName")
private var _Code2: ImageVector? = null
