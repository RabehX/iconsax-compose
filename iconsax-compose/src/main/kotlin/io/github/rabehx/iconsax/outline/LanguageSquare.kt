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

val Iconsax.Outline.LanguageSquare: ImageVector
    get() {
        if (_LanguageSquare != null) {
            return _LanguageSquare!!
        }
        _LanguageSquare = ImageVector.Builder(
            name = "Outline.LanguageSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.99f, 9.71f)
                horizontalLineTo(7.01f)
                curveTo(6.6f, 9.71f, 6.26f, 9.37f, 6.26f, 8.96f)
                curveTo(6.26f, 8.55f, 6.6f, 8.21f, 7.01f, 8.21f)
                horizontalLineTo(16.99f)
                curveTo(17.4f, 8.21f, 17.74f, 8.55f, 17.74f, 8.96f)
                curveTo(17.74f, 9.37f, 17.4f, 9.71f, 16.99f, 9.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.71f)
                curveTo(11.59f, 9.71f, 11.25f, 9.37f, 11.25f, 8.96f)
                verticalLineTo(7.28f)
                curveTo(11.25f, 6.87f, 11.59f, 6.53f, 12f, 6.53f)
                curveTo(12.41f, 6.53f, 12.75f, 6.87f, 12.75f, 7.28f)
                verticalLineTo(8.96f)
                curveTo(12.75f, 9.37f, 12.41f, 9.71f, 12f, 9.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 17.47f)
                curveTo(6.59f, 17.47f, 6.25f, 17.13f, 6.25f, 16.72f)
                curveTo(6.25f, 16.31f, 6.59f, 15.97f, 7f, 15.97f)
                curveTo(10.72f, 15.97f, 13.75f, 12.82f, 13.75f, 8.94f)
                curveTo(13.75f, 8.53f, 14.09f, 8.19f, 14.5f, 8.19f)
                curveTo(14.91f, 8.19f, 15.25f, 8.53f, 15.25f, 8.94f)
                curveTo(15.25f, 13.65f, 11.55f, 17.47f, 7f, 17.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.001f, 17.47f)
                curveTo(15.031f, 17.47f, 13.201f, 16.49f, 11.861f, 14.7f)
                curveTo(11.611f, 14.37f, 11.681f, 13.9f, 12.011f, 13.65f)
                curveTo(12.341f, 13.4f, 12.811f, 13.47f, 13.061f, 13.8f)
                curveTo(14.121f, 15.2f, 15.521f, 15.97f, 17.011f, 15.97f)
                curveTo(17.421f, 15.97f, 17.761f, 16.31f, 17.761f, 16.72f)
                curveTo(17.761f, 17.13f, 17.411f, 17.47f, 17.001f, 17.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _LanguageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageSquare: ImageVector? = null
