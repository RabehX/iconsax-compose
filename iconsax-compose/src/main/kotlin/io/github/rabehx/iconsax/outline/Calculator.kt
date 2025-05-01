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

val Iconsax.Outline.Calculator: ImageVector
    get() {
        if (_Calculator != null) {
            return _Calculator!!
        }
        _Calculator = ImageVector.Builder(
            name = "Outline.Calculator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 22.75f)
                horizontalLineTo(10f)
                curveTo(4.57f, 22.75f, 2.25f, 20.43f, 2.25f, 15f)
                verticalLineTo(9f)
                curveTo(2.25f, 3.57f, 4.57f, 1.25f, 10f, 1.25f)
                horizontalLineTo(14f)
                curveTo(19.43f, 1.25f, 21.75f, 3.57f, 21.75f, 9f)
                verticalLineTo(15f)
                curveTo(21.75f, 20.43f, 19.43f, 22.75f, 14f, 22.75f)
                close()
                moveTo(10f, 2.75f)
                curveTo(5.39f, 2.75f, 3.75f, 4.39f, 3.75f, 9f)
                verticalLineTo(15f)
                curveTo(3.75f, 19.61f, 5.39f, 21.25f, 10f, 21.25f)
                horizontalLineTo(14f)
                curveTo(18.61f, 21.25f, 20.25f, 19.61f, 20.25f, 15f)
                verticalLineTo(9f)
                curveTo(20.25f, 4.39f, 18.61f, 2.75f, 14f, 2.75f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 10.83f)
                horizontalLineTo(9f)
                curveTo(7.76f, 10.83f, 6.75f, 9.82f, 6.75f, 8.58f)
                verticalLineTo(7.58f)
                curveTo(6.75f, 6.34f, 7.76f, 5.33f, 9f, 5.33f)
                horizontalLineTo(15f)
                curveTo(16.24f, 5.33f, 17.25f, 6.34f, 17.25f, 7.58f)
                verticalLineTo(8.58f)
                curveTo(17.25f, 9.82f, 16.24f, 10.83f, 15f, 10.83f)
                close()
                moveTo(9f, 6.83f)
                curveTo(8.59f, 6.83f, 8.25f, 7.17f, 8.25f, 7.58f)
                verticalLineTo(8.58f)
                curveTo(8.25f, 8.99f, 8.59f, 9.33f, 9f, 9.33f)
                horizontalLineTo(15f)
                curveTo(15.41f, 9.33f, 15.75f, 8.99f, 15.75f, 8.58f)
                verticalLineTo(7.58f)
                curveTo(15.75f, 7.17f, 15.41f, 6.83f, 15f, 6.83f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.15f, 14.92f)
                curveTo(8.02f, 14.92f, 7.89f, 14.89f, 7.77f, 14.84f)
                curveTo(7.65f, 14.79f, 7.54f, 14.72f, 7.45f, 14.63f)
                curveTo(7.26f, 14.44f, 7.16f, 14.19f, 7.16f, 13.92f)
                curveTo(7.16f, 13.79f, 7.18f, 13.66f, 7.23f, 13.54f)
                curveTo(7.28f, 13.41f, 7.35f, 13.31f, 7.45f, 13.21f)
                curveTo(7.49f, 13.17f, 7.54f, 13.12f, 7.6f, 13.09f)
                curveTo(7.65f, 13.05f, 7.71f, 13.02f, 7.77f, 13f)
                curveTo(7.83f, 12.97f, 7.9f, 12.95f, 7.96f, 12.94f)
                curveTo(8.28f, 12.87f, 8.63f, 12.98f, 8.86f, 13.21f)
                curveTo(8.95f, 13.3f, 9.03f, 13.41f, 9.08f, 13.54f)
                curveTo(9.13f, 13.66f, 9.16f, 13.79f, 9.16f, 13.92f)
                curveTo(9.16f, 14.19f, 9.05f, 14.44f, 8.86f, 14.63f)
                curveTo(8.67f, 14.82f, 8.42f, 14.92f, 8.15f, 14.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.16f, 14.92f)
                curveTo(11.89f, 14.92f, 11.64f, 14.82f, 11.45f, 14.63f)
                curveTo(11.26f, 14.44f, 11.16f, 14.19f, 11.16f, 13.92f)
                curveTo(11.16f, 13.79f, 11.18f, 13.66f, 11.23f, 13.54f)
                curveTo(11.28f, 13.41f, 11.35f, 13.31f, 11.45f, 13.21f)
                curveTo(11.49f, 13.17f, 11.54f, 13.12f, 11.6f, 13.09f)
                curveTo(11.65f, 13.05f, 11.71f, 13.02f, 11.77f, 13f)
                curveTo(11.83f, 12.97f, 11.9f, 12.95f, 11.96f, 12.94f)
                curveTo(12.15f, 12.9f, 12.35f, 12.92f, 12.54f, 13f)
                curveTo(12.66f, 13.05f, 12.77f, 13.12f, 12.86f, 13.21f)
                curveTo(12.95f, 13.31f, 13.03f, 13.41f, 13.08f, 13.54f)
                curveTo(13.13f, 13.66f, 13.16f, 13.79f, 13.16f, 13.92f)
                curveTo(13.16f, 14.19f, 13.05f, 14.44f, 12.86f, 14.63f)
                curveTo(12.67f, 14.82f, 12.42f, 14.92f, 12.16f, 14.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.15f, 14.92f)
                curveTo(16.02f, 14.92f, 15.89f, 14.89f, 15.77f, 14.84f)
                curveTo(15.65f, 14.79f, 15.54f, 14.72f, 15.45f, 14.63f)
                curveTo(15.35f, 14.53f, 15.28f, 14.42f, 15.23f, 14.3f)
                curveTo(15.18f, 14.18f, 15.16f, 14.05f, 15.16f, 13.92f)
                curveTo(15.16f, 13.79f, 15.18f, 13.66f, 15.23f, 13.54f)
                curveTo(15.28f, 13.41f, 15.35f, 13.31f, 15.45f, 13.21f)
                curveTo(15.82f, 12.84f, 16.49f, 12.84f, 16.86f, 13.21f)
                curveTo(17.05f, 13.4f, 17.16f, 13.66f, 17.16f, 13.92f)
                curveTo(17.16f, 14.19f, 17.05f, 14.44f, 16.86f, 14.63f)
                curveTo(16.68f, 14.81f, 16.43f, 14.92f, 16.15f, 14.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.16f, 18.92f)
                curveTo(7.89f, 18.92f, 7.64f, 18.82f, 7.45f, 18.63f)
                curveTo(7.26f, 18.44f, 7.15f, 18.19f, 7.15f, 17.92f)
                curveTo(7.15f, 17.66f, 7.26f, 17.4f, 7.45f, 17.21f)
                curveTo(7.49f, 17.17f, 7.55f, 17.12f, 7.6f, 17.09f)
                curveTo(7.65f, 17.05f, 7.71f, 17.02f, 7.77f, 17f)
                curveTo(7.83f, 16.97f, 7.9f, 16.95f, 7.96f, 16.94f)
                curveTo(8.29f, 16.88f, 8.63f, 16.98f, 8.86f, 17.21f)
                curveTo(8.91f, 17.26f, 8.95f, 17.31f, 8.99f, 17.36f)
                curveTo(9.02f, 17.42f, 9.05f, 17.48f, 9.08f, 17.54f)
                curveTo(9.1f, 17.6f, 9.12f, 17.66f, 9.14f, 17.72f)
                curveTo(9.15f, 17.79f, 9.16f, 17.85f, 9.16f, 17.92f)
                curveTo(9.16f, 18.19f, 9.05f, 18.44f, 8.86f, 18.63f)
                curveTo(8.67f, 18.82f, 8.42f, 18.92f, 8.16f, 18.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.16f, 18.92f)
                curveTo(11.89f, 18.92f, 11.64f, 18.82f, 11.45f, 18.63f)
                curveTo(11.26f, 18.44f, 11.15f, 18.19f, 11.15f, 17.92f)
                curveTo(11.15f, 17.66f, 11.26f, 17.4f, 11.45f, 17.21f)
                curveTo(11.68f, 16.98f, 12.03f, 16.88f, 12.35f, 16.94f)
                curveTo(12.41f, 16.95f, 12.48f, 16.97f, 12.54f, 17f)
                curveTo(12.6f, 17.02f, 12.66f, 17.05f, 12.71f, 17.09f)
                curveTo(12.76f, 17.12f, 12.81f, 17.17f, 12.86f, 17.21f)
                curveTo(13.05f, 17.4f, 13.15f, 17.66f, 13.15f, 17.92f)
                curveTo(13.15f, 18.19f, 13.05f, 18.44f, 12.86f, 18.63f)
                curveTo(12.67f, 18.82f, 12.42f, 18.92f, 12.16f, 18.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.15f, 18.92f)
                curveTo(15.89f, 18.92f, 15.64f, 18.82f, 15.45f, 18.63f)
                curveTo(15.26f, 18.44f, 15.16f, 18.19f, 15.16f, 17.92f)
                curveTo(15.16f, 17.66f, 15.26f, 17.4f, 15.45f, 17.21f)
                curveTo(15.54f, 17.12f, 15.65f, 17.05f, 15.77f, 17f)
                curveTo(16.14f, 16.85f, 16.59f, 16.93f, 16.86f, 17.21f)
                curveTo(17.05f, 17.4f, 17.15f, 17.66f, 17.15f, 17.92f)
                curveTo(17.15f, 18.19f, 17.05f, 18.44f, 16.86f, 18.63f)
                curveTo(16.77f, 18.72f, 16.66f, 18.79f, 16.54f, 18.84f)
                curveTo(16.42f, 18.89f, 16.29f, 18.92f, 16.15f, 18.92f)
                close()
            }
        }.build()

        return _Calculator!!
    }

@Suppress("ObjectPropertyName")
private var _Calculator: ImageVector? = null
