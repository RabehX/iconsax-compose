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

val Iconsax.Outline.Monitor: ImageVector
    get() {
        if (_Monitor != null) {
            return _Monitor!!
        }
        _Monitor = ImageVector.Builder(
            name = "Outline.Monitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 17.97f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 17.97f, 1.25f, 16.76f, 1.25f, 12.78f)
                verticalLineTo(6.44f)
                curveTo(1.25f, 2.46f, 2.46f, 1.25f, 6.44f, 1.25f)
                horizontalLineTo(17.55f)
                curveTo(21.53f, 1.25f, 22.74f, 2.46f, 22.74f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(22.75f, 16.76f, 21.54f, 17.97f, 17.56f, 17.97f)
                close()
                moveTo(6.44f, 2.75f)
                curveTo(3.3f, 2.75f, 2.75f, 3.3f, 2.75f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(2.75f, 15.91f, 3.3f, 16.46f, 6.44f, 16.46f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 16.46f, 21.24f, 15.91f, 21.24f, 12.77f)
                verticalLineTo(6.44f)
                curveTo(21.24f, 3.3f, 20.69f, 2.75f, 17.55f, 2.75f)
                horizontalLineTo(6.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(17.22f)
                curveTo(11.25f, 16.81f, 11.59f, 16.47f, 12f, 16.47f)
                curveTo(12.41f, 16.47f, 12.75f, 16.81f, 12.75f, 17.22f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 13.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 13.75f, 1.25f, 13.41f, 1.25f, 13f)
                curveTo(1.25f, 12.59f, 1.59f, 12.25f, 2f, 12.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 22.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 22.75f, 6.75f, 22.41f, 6.75f, 22f)
                curveTo(6.75f, 21.59f, 7.09f, 21.25f, 7.5f, 21.25f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 21.25f, 17.25f, 21.59f, 17.25f, 22f)
                curveTo(17.25f, 22.41f, 16.91f, 22.75f, 16.5f, 22.75f)
                close()
            }
        }.build()

        return _Monitor!!
    }

@Suppress("ObjectPropertyName")
private var _Monitor: ImageVector? = null
