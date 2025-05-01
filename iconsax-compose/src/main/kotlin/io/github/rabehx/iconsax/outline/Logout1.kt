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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Logout1: ImageVector
    get() {
        if (_Logout1 != null) {
            return _Logout1!!
        }
        _Logout1 = ImageVector.Builder(
            name = "Outline.Logout1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.441f, 15.37f)
                curveTo(17.251f, 15.37f, 17.061f, 15.3f, 16.911f, 15.15f)
                curveTo(16.621f, 14.86f, 16.621f, 14.38f, 16.911f, 14.09f)
                lineTo(18.941f, 12.06f)
                lineTo(16.911f, 10.03f)
                curveTo(16.621f, 9.74f, 16.621f, 9.26f, 16.911f, 8.97f)
                curveTo(17.201f, 8.68f, 17.681f, 8.68f, 17.971f, 8.97f)
                lineTo(20.531f, 11.53f)
                curveTo(20.821f, 11.82f, 20.821f, 12.3f, 20.531f, 12.59f)
                lineTo(17.971f, 15.15f)
                curveTo(17.821f, 15.3f, 17.631f, 15.37f, 17.441f, 15.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.93f, 12.81f)
                horizontalLineTo(9.76f)
                curveTo(9.35f, 12.81f, 9.01f, 12.47f, 9.01f, 12.06f)
                curveTo(9.01f, 11.65f, 9.35f, 11.31f, 9.76f, 11.31f)
                horizontalLineTo(19.93f)
                curveTo(20.34f, 11.31f, 20.68f, 11.65f, 20.68f, 12.06f)
                curveTo(20.68f, 12.47f, 20.34f, 12.81f, 19.93f, 12.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.76f, 20.75f)
                curveTo(6.61f, 20.75f, 3.01f, 17.15f, 3.01f, 12f)
                curveTo(3.01f, 6.85f, 6.61f, 3.25f, 11.76f, 3.25f)
                curveTo(12.17f, 3.25f, 12.51f, 3.59f, 12.51f, 4f)
                curveTo(12.51f, 4.41f, 12.17f, 4.75f, 11.76f, 4.75f)
                curveTo(7.49f, 4.75f, 4.51f, 7.73f, 4.51f, 12f)
                curveTo(4.51f, 16.27f, 7.49f, 19.25f, 11.76f, 19.25f)
                curveTo(12.17f, 19.25f, 12.51f, 19.59f, 12.51f, 20f)
                curveTo(12.51f, 20.41f, 12.17f, 20.75f, 11.76f, 20.75f)
                close()
            }
        }.build()

        return _Logout1!!
    }

@Suppress("ObjectPropertyName")
private var _Logout1: ImageVector? = null
