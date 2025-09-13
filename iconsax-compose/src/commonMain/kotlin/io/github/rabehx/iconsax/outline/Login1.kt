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

val Iconsax.Outline.Login1: ImageVector
    get() {
        if (_Login1 != null) {
            return _Login1!!
        }
        _Login1 = ImageVector.Builder(
            name = "Outline.Login1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.679f, 15.37f)
                curveTo(11.489f, 15.37f, 11.299f, 15.3f, 11.149f, 15.15f)
                curveTo(10.859f, 14.86f, 10.859f, 14.38f, 11.149f, 14.09f)
                lineTo(13.179f, 12.06f)
                lineTo(11.149f, 10.03f)
                curveTo(10.859f, 9.74f, 10.859f, 9.26f, 11.149f, 8.97f)
                curveTo(11.439f, 8.68f, 11.919f, 8.68f, 12.209f, 8.97f)
                lineTo(14.769f, 11.53f)
                curveTo(15.059f, 11.82f, 15.059f, 12.3f, 14.769f, 12.59f)
                lineTo(12.209f, 15.15f)
                curveTo(12.069f, 15.3f, 11.869f, 15.37f, 11.679f, 15.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.17f, 12.81f)
                horizontalLineTo(4f)
                curveTo(3.59f, 12.81f, 3.25f, 12.47f, 3.25f, 12.06f)
                curveTo(3.25f, 11.65f, 3.59f, 11.31f, 4f, 11.31f)
                horizontalLineTo(14.17f)
                curveTo(14.58f, 11.31f, 14.92f, 11.65f, 14.92f, 12.06f)
                curveTo(14.92f, 12.47f, 14.58f, 12.81f, 14.17f, 12.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 20.75f)
                curveTo(11.59f, 20.75f, 11.25f, 20.41f, 11.25f, 20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                curveTo(16.27f, 19.25f, 19.25f, 16.27f, 19.25f, 12f)
                curveTo(19.25f, 7.73f, 16.27f, 4.75f, 12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                curveTo(11.25f, 3.59f, 11.59f, 3.25f, 12f, 3.25f)
                curveTo(17.15f, 3.25f, 20.75f, 6.85f, 20.75f, 12f)
                curveTo(20.75f, 17.15f, 17.15f, 20.75f, 12f, 20.75f)
                close()
            }
        }.build()

        return _Login1!!
    }

@Suppress("ObjectPropertyName")
private var _Login1: ImageVector? = null
