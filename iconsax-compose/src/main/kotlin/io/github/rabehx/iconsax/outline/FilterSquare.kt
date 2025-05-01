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

val Iconsax.Outline.FilterSquare: ImageVector
    get() {
        if (_FilterSquare != null) {
            return _FilterSquare!!
        }
        _FilterSquare = ImageVector.Builder(
            name = "Outline.FilterSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.38f, 18.9f)
                curveTo(11.05f, 18.9f, 10.72f, 18.82f, 10.42f, 18.65f)
                curveTo(9.81f, 18.31f, 9.44f, 17.69f, 9.44f, 16.99f)
                verticalLineTo(13.91f)
                curveTo(9.44f, 13.72f, 9.29f, 13.35f, 9.14f, 13.16f)
                lineTo(6.97f, 10.88f)
                curveTo(6.56f, 10.47f, 6.25f, 9.75f, 6.25f, 9.2f)
                verticalLineTo(7.87f)
                curveTo(6.25f, 6.76f, 7.09f, 5.9f, 8.16f, 5.9f)
                horizontalLineTo(15.83f)
                curveTo(16.88f, 5.9f, 17.74f, 6.76f, 17.74f, 7.81f)
                verticalLineTo(9.09f)
                curveTo(17.74f, 9.79f, 17.34f, 10.56f, 16.94f, 10.96f)
                lineTo(14.41f, 13.2f)
                curveTo(14.25f, 13.34f, 14.08f, 13.69f, 14.08f, 13.98f)
                verticalLineTo(16.48f)
                curveTo(14.08f, 17.11f, 13.7f, 17.81f, 13.19f, 18.11f)
                lineTo(12.4f, 18.62f)
                curveTo(12.09f, 18.81f, 11.74f, 18.9f, 11.38f, 18.9f)
                close()
                moveTo(8.16f, 7.4f)
                curveTo(7.92f, 7.4f, 7.75f, 7.6f, 7.75f, 7.87f)
                verticalLineTo(9.2f)
                curveTo(7.75f, 9.33f, 7.89f, 9.67f, 8.05f, 9.83f)
                lineTo(10.27f, 12.17f)
                curveTo(10.61f, 12.6f, 10.94f, 13.29f, 10.94f, 13.91f)
                verticalLineTo(16.99f)
                curveTo(10.94f, 17.19f, 11.07f, 17.3f, 11.15f, 17.34f)
                curveTo(11.26f, 17.4f, 11.44f, 17.44f, 11.6f, 17.34f)
                lineTo(12.4f, 16.82f)
                curveTo(12.48f, 16.76f, 12.58f, 16.56f, 12.58f, 16.46f)
                verticalLineTo(13.96f)
                curveTo(12.58f, 13.25f, 12.93f, 12.46f, 13.43f, 12.05f)
                lineTo(15.91f, 9.85f)
                curveTo(16.04f, 9.72f, 16.24f, 9.32f, 16.24f, 9.07f)
                verticalLineTo(7.81f)
                curveTo(16.24f, 7.59f, 16.05f, 7.4f, 15.83f, 7.4f)
                horizontalLineTo(8.16f)
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

        return _FilterSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSquare: ImageVector? = null
