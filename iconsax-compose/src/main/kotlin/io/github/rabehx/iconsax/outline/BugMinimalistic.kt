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

val Iconsax.Outline.BugMinimalistic: ImageVector
    get() {
        if (_BugMinimalistic != null) {
            return _BugMinimalistic!!
        }
        _BugMinimalistic = ImageVector.Builder(
            name = "Outline.BugMinimalistic",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(0.75f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.643f, 1.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.257f, 1.03f)
                lineToRelative(-1.292f, 0.774f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.954f, 3.355f)
                lineToRelative(1.173f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.557f, 1.393f)
                lineToRelative(-1.24f, 0.497f)
                curveToRelative(0.139f, 0.58f, 0.212f, 1.185f, 0.212f, 1.807f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineTo(15f)
                curveToRelative(0f, 0.95f, -0.17f, 1.859f, -0.483f, 2.7f)
                lineToRelative(1.512f, 0.604f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.558f, 1.393f)
                lineToRelative(-1.613f, -0.646f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.608f, 3.7f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.608f, -3.7f)
                lineToRelative(-1.613f, 0.646f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.558f, -1.393f)
                lineToRelative(1.512f, -0.605f)
                arcTo(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.25f, 15f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.622f, 0.073f, -1.227f, 0.212f, -1.807f)
                lineToRelative(-1.24f, -0.497f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.557f, -1.392f)
                lineToRelative(1.173f, 0.469f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.954f, -3.355f)
                lineToRelative(-1.292f, -0.775f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.772f, -1.286f)
                lineToRelative(2.153f, 1.292f)
                arcTo(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                curveToRelative(0.86f, 0f, 1.688f, 0.14f, 2.46f, 0.399f)
                lineToRelative(2.154f, -1.292f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.257f)
                moveTo(9.55f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.415f, -0.16f)
                arcTo(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                curveToRelative(0.713f, 0f, 1.397f, 0.12f, 2.035f, 0.339f)
                curveToRelative(0.12f, 0.094f, 0.265f, 0.15f, 0.415f, 0.16f)
                arcTo(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.25f, 10f)
                verticalLineToRelative(5f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.5f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, -5.751f)
            }
        }.build()

        return _BugMinimalistic!!
    }

@Suppress("ObjectPropertyName")
private var _BugMinimalistic: ImageVector? = null
