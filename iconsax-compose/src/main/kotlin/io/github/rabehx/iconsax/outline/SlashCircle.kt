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

val Iconsax.Outline.SlashCircle: ImageVector
    get() {
        if (_SlashCircle != null) {
            return _SlashCircle!!
        }
        _SlashCircle = ImageVector.Builder(
            name = "Outline.SlashCircle",
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
                moveTo(12f, 1.25f)
                curveTo(6.063f, 1.25f, 1.25f, 6.063f, 1.25f, 12f)
                reflectiveCurveTo(6.063f, 22.75f, 12f, 22.75f)
                reflectiveCurveTo(22.75f, 17.937f, 22.75f, 12f)
                reflectiveCurveTo(17.937f, 1.25f, 12f, 1.25f)
                moveTo(2.75f, 12f)
                arcToRelative(9.25f, 9.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 0f)
                arcToRelative(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.5f, 0f)
            }
        }.build()

        return _SlashCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SlashCircle: ImageVector? = null
