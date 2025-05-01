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

val Iconsax.Outline.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Outline.Flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.15f, 22.75f)
                curveTo(4.74f, 22.75f, 4.4f, 22.41f, 4.4f, 22f)
                verticalLineTo(2f)
                curveTo(4.4f, 1.59f, 4.74f, 1.25f, 5.15f, 1.25f)
                curveTo(5.56f, 1.25f, 5.9f, 1.59f, 5.9f, 2f)
                verticalLineTo(22f)
                curveTo(5.9f, 22.41f, 5.56f, 22.75f, 5.15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.35f, 16.75f)
                horizontalLineTo(5.15f)
                curveTo(4.74f, 16.75f, 4.4f, 16.41f, 4.4f, 16f)
                curveTo(4.4f, 15.59f, 4.74f, 15.25f, 5.15f, 15.25f)
                horizontalLineTo(16.35f)
                curveTo(17.44f, 15.25f, 17.95f, 14.96f, 18.05f, 14.71f)
                curveTo(18.15f, 14.46f, 18f, 13.9f, 17.22f, 13.13f)
                lineTo(16.02f, 11.93f)
                curveTo(15.53f, 11.5f, 15.23f, 10.85f, 15.2f, 10.13f)
                curveTo(15.17f, 9.37f, 15.47f, 8.62f, 16.02f, 8.07f)
                lineTo(17.22f, 6.87f)
                curveTo(17.96f, 6.13f, 18.19f, 5.53f, 18.08f, 5.27f)
                curveTo(17.97f, 5.01f, 17.4f, 4.75f, 16.35f, 4.75f)
                horizontalLineTo(5.15f)
                curveTo(4.73f, 4.75f, 4.4f, 4.41f, 4.4f, 4f)
                curveTo(4.4f, 3.59f, 4.74f, 3.25f, 5.15f, 3.25f)
                horizontalLineTo(16.35f)
                curveTo(18.54f, 3.25f, 19.24f, 4.16f, 19.47f, 4.7f)
                curveTo(19.69f, 5.24f, 19.84f, 6.38f, 18.28f, 7.94f)
                lineTo(17.08f, 9.14f)
                curveTo(16.83f, 9.39f, 16.69f, 9.74f, 16.7f, 10.09f)
                curveTo(16.71f, 10.39f, 16.83f, 10.66f, 17.04f, 10.85f)
                lineTo(18.28f, 12.08f)
                curveTo(19.81f, 13.61f, 19.66f, 14.75f, 19.44f, 15.3f)
                curveTo(19.21f, 15.83f, 18.5f, 16.75f, 16.35f, 16.75f)
                close()
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
