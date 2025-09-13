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

val Iconsax.Filled.Bug: ImageVector
    get() {
        if (_Bug != null) {
            return _Bug!!
        }
        _Bug = ImageVector.Builder(
            name = "Filled.Bug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.416f, 2.624f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.832f, -1.248f)
                lineTo(13.669f, 3.32f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveToRelative(-0.59f, 0f, -1.153f, 0.113f, -1.669f, 0.32f)
                lineTo(7.416f, 1.376f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.832f, 1.248f)
                lineToRelative(2.36f, 1.573f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.368f, 2.475f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.938f, 6.5f)
                horizontalLineToRelative(6.125f)
                quadToRelative(0.707f, 0.002f, 1.361f, 0.172f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.368f, -2.475f)
                close()
                moveTo(1.25f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.312f)
                curveToRelative(0f, -0.836f, 0.26f, -1.611f, 0.704f, -2.248f)
                lineToRelative(-2.483f, -0.994f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.558f, -1.392f)
                lineToRelative(3.136f, 1.254f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.938f, 8f)
                horizontalLineToRelative(6.124f)
                curveToRelative(0.74f, 0f, 1.432f, 0.204f, 2.023f, 0.558f)
                lineToRelative(3.136f, -1.254f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.558f, 1.392f)
                lineToRelative(-2.483f, 0.994f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11.938f)
                verticalLineToRelative(1.312f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(15f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.808f, 3.269f)
                lineToRelative(2.587f, 1.035f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.558f, 1.393f)
                lineToRelative(-2.892f, -1.158f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.579f, 2.421f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.579f, -2.42f)
                lineTo(3.78f, 20.696f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.558f, -1.393f)
                lineToRelative(2.588f, -1.035f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                verticalLineToRelative(-0.25f)
                horizontalLineTo(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _Bug!!
    }

@Suppress("ObjectPropertyName")
private var _Bug: ImageVector? = null
