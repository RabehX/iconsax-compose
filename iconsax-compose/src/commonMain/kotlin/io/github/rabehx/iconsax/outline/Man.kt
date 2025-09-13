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

val Iconsax.Outline.Man: ImageVector
    get() {
        if (_Man != null) {
            return _Man!!
        }
        _Man = ImageVector.Builder(
            name = "Outline.Man",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.25f, 22.25f)
                curveTo(5.56f, 22.25f, 1.75f, 18.44f, 1.75f, 13.75f)
                curveTo(1.75f, 9.06f, 5.56f, 5.25f, 10.25f, 5.25f)
                curveTo(14.94f, 5.25f, 18.75f, 9.06f, 18.75f, 13.75f)
                curveTo(18.75f, 18.44f, 14.94f, 22.25f, 10.25f, 22.25f)
                close()
                moveTo(10.25f, 6.75f)
                curveTo(6.39f, 6.75f, 3.25f, 9.89f, 3.25f, 13.75f)
                curveTo(3.25f, 17.61f, 6.39f, 20.75f, 10.25f, 20.75f)
                curveTo(14.11f, 20.75f, 17.25f, 17.61f, 17.25f, 13.75f)
                curveTo(17.25f, 9.89f, 14.11f, 6.75f, 10.25f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8.75f)
                curveTo(15.81f, 8.75f, 15.62f, 8.68f, 15.47f, 8.53f)
                curveTo(15.18f, 8.24f, 15.18f, 7.76f, 15.47f, 7.47f)
                lineTo(20.97f, 1.97f)
                curveTo(21.26f, 1.68f, 21.74f, 1.68f, 22.03f, 1.97f)
                curveTo(22.32f, 2.26f, 22.32f, 2.74f, 22.03f, 3.03f)
                lineTo(16.53f, 8.53f)
                curveTo(16.38f, 8.68f, 16.19f, 8.75f, 16f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 9.75f)
                curveTo(21.09f, 9.75f, 20.75f, 9.41f, 20.75f, 9f)
                verticalLineTo(3.25f)
                horizontalLineTo(15f)
                curveTo(14.59f, 3.25f, 14.25f, 2.91f, 14.25f, 2.5f)
                curveTo(14.25f, 2.09f, 14.59f, 1.75f, 15f, 1.75f)
                horizontalLineTo(21.5f)
                curveTo(21.91f, 1.75f, 22.25f, 2.09f, 22.25f, 2.5f)
                verticalLineTo(9f)
                curveTo(22.25f, 9.41f, 21.91f, 9.75f, 21.5f, 9.75f)
                close()
            }
        }.build()

        return _Man!!
    }

@Suppress("ObjectPropertyName")
private var _Man: ImageVector? = null
