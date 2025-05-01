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

val Iconsax.Outline.Building: ImageVector
    get() {
        if (_Building != null) {
            return _Building!!
        }
        _Building = ImageVector.Builder(
            name = "Outline.Building",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 22.75f)
                horizontalLineTo(4.08f)
                curveTo(2.51f, 22.75f, 1.22f, 21.49f, 1.22f, 19.93f)
                verticalLineTo(5.09f)
                curveTo(1.22f, 3.56f, 1.79f, 2.37f, 2.83f, 1.72f)
                curveTo(3.88f, 1.06f, 5.24f, 1.08f, 6.65f, 1.78f)
                lineTo(11.09f, 3.96f)
                curveTo(12.3f, 4.56f, 13.25f, 6.07f, 13.25f, 7.41f)
                verticalLineTo(22f)
                curveTo(13.25f, 22.41f, 12.91f, 22.75f, 12.5f, 22.75f)
                close()
                moveTo(4.56f, 2.75f)
                curveTo(4.21f, 2.75f, 3.89f, 2.83f, 3.62f, 3f)
                curveTo(3.04f, 3.36f, 2.72f, 4.11f, 2.72f, 5.09f)
                verticalLineTo(19.93f)
                curveTo(2.72f, 20.66f, 3.33f, 21.25f, 4.08f, 21.25f)
                horizontalLineTo(11.75f)
                verticalLineTo(7.41f)
                curveTo(11.75f, 6.64f, 11.13f, 5.65f, 10.42f, 5.31f)
                lineTo(5.98f, 3.13f)
                curveTo(5.47f, 2.88f, 4.99f, 2.75f, 4.56f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.81f, 22.75f)
                horizontalLineTo(12.5f)
                curveTo(12.09f, 22.75f, 11.75f, 22.41f, 11.75f, 22f)
                verticalLineTo(10.42f)
                curveTo(11.75f, 10.19f, 11.85f, 9.98f, 12.03f, 9.84f)
                curveTo(12.21f, 9.7f, 12.43f, 9.64f, 12.66f, 9.69f)
                lineTo(13.13f, 9.79f)
                lineTo(19.67f, 11.25f)
                curveTo(21.66f, 11.69f, 22.66f, 12.86f, 22.72f, 14.85f)
                curveTo(22.73f, 14.85f, 22.73f, 14.95f, 22.73f, 15.06f)
                verticalLineTo(18.84f)
                curveTo(22.72f, 21.4f, 21.37f, 22.75f, 18.81f, 22.75f)
                close()
                moveTo(13.25f, 21.25f)
                horizontalLineTo(18.81f)
                curveTo(20.57f, 21.25f, 21.22f, 20.6f, 21.22f, 18.84f)
                verticalLineTo(14.98f)
                curveTo(21.17f, 13.61f, 20.65f, 13f, 19.34f, 12.71f)
                lineTo(13.25f, 11.35f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.97f, 9.75f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 9.75f, 4.75f, 9.41f, 4.75f, 9f)
                curveTo(4.75f, 8.59f, 5.09f, 8.25f, 5.5f, 8.25f)
                horizontalLineTo(8.97f)
                curveTo(9.38f, 8.25f, 9.72f, 8.59f, 9.72f, 9f)
                curveTo(9.72f, 9.41f, 9.39f, 9.75f, 8.97f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.97f, 13.75f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 13.75f, 4.75f, 13.41f, 4.75f, 13f)
                curveTo(4.75f, 12.59f, 5.09f, 12.25f, 5.5f, 12.25f)
                horizontalLineTo(8.97f)
                curveTo(9.38f, 12.25f, 9.72f, 12.59f, 9.72f, 13f)
                curveTo(9.72f, 13.41f, 9.39f, 13.75f, 8.97f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.22f, 17.75f)
                curveTo(13.57f, 17.75f, 12.22f, 16.4f, 12.22f, 14.75f)
                verticalLineTo(10.52f)
                curveTo(12.22f, 10.29f, 12.32f, 10.08f, 12.5f, 9.93f)
                curveTo(12.68f, 9.78f, 12.91f, 9.73f, 13.13f, 9.78f)
                lineTo(17.63f, 10.79f)
                curveTo(17.97f, 10.87f, 18.22f, 11.17f, 18.22f, 11.52f)
                verticalLineTo(14.74f)
                curveTo(18.22f, 16.4f, 16.88f, 17.75f, 15.22f, 17.75f)
                close()
                moveTo(13.72f, 11.46f)
                verticalLineTo(14.75f)
                curveTo(13.72f, 15.58f, 14.39f, 16.25f, 15.22f, 16.25f)
                curveTo(16.05f, 16.25f, 16.72f, 15.58f, 16.72f, 14.75f)
                verticalLineTo(12.13f)
                lineTo(13.72f, 11.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.72f, 17.75f)
                curveTo(18.07f, 17.75f, 16.72f, 16.4f, 16.72f, 14.75f)
                verticalLineTo(11.53f)
                curveTo(16.72f, 11.3f, 16.82f, 11.09f, 17f, 10.95f)
                curveTo(17.18f, 10.81f, 17.41f, 10.75f, 17.63f, 10.8f)
                lineTo(19.66f, 11.25f)
                curveTo(21.65f, 11.69f, 22.65f, 12.86f, 22.71f, 14.85f)
                curveTo(22.71f, 14.87f, 22.71f, 14.89f, 22.71f, 14.91f)
                curveTo(22.63f, 16.5f, 21.32f, 17.75f, 19.72f, 17.75f)
                close()
                moveTo(18.22f, 12.46f)
                verticalLineTo(14.75f)
                curveTo(18.22f, 15.58f, 18.89f, 16.25f, 19.72f, 16.25f)
                curveTo(20.51f, 16.25f, 21.16f, 15.64f, 21.21f, 14.86f)
                curveTo(21.16f, 13.6f, 20.64f, 13f, 19.34f, 12.71f)
                lineTo(18.22f, 12.46f)
                close()
            }
        }.build()

        return _Building!!
    }

@Suppress("ObjectPropertyName")
private var _Building: ImageVector? = null
