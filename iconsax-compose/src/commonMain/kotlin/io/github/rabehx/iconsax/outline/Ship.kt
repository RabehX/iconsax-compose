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

val Iconsax.Outline.Ship: ImageVector
    get() {
        if (_Ship != null) {
            return _Ship!!
        }
        _Ship = ImageVector.Builder(
            name = "Outline.Ship",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.38f, 22.75f)
                horizontalLineTo(9.62f)
                curveTo(5.84f, 22.75f, 2.87f, 20.37f, 2.05f, 16.68f)
                lineTo(1.64f, 14.82f)
                curveTo(1.36f, 13.54f, 2.09f, 12.16f, 3.3f, 11.67f)
                lineTo(10.23f, 8.89f)
                curveTo(11.37f, 8.44f, 12.63f, 8.44f, 13.77f, 8.89f)
                lineTo(20.7f, 11.67f)
                curveTo(21.92f, 12.16f, 22.65f, 13.54f, 22.36f, 14.82f)
                lineTo(21.95f, 16.68f)
                curveTo(21.13f, 20.37f, 18.16f, 22.75f, 14.38f, 22.75f)
                close()
                moveTo(12f, 10.05f)
                curveTo(11.59f, 10.05f, 11.18f, 10.13f, 10.78f, 10.28f)
                lineTo(3.85f, 13.06f)
                curveTo(3.32f, 13.27f, 2.97f, 13.94f, 3.09f, 14.49f)
                lineTo(3.5f, 16.35f)
                curveTo(4.17f, 19.37f, 6.51f, 21.24f, 9.61f, 21.24f)
                horizontalLineTo(14.37f)
                curveTo(17.47f, 21.24f, 19.81f, 19.37f, 20.48f, 16.35f)
                lineTo(20.89f, 14.49f)
                curveTo(21.01f, 13.94f, 20.66f, 13.27f, 20.13f, 13.06f)
                lineTo(13.2f, 10.28f)
                curveTo(12.82f, 10.13f, 12.41f, 10.05f, 12f, 10.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(10f)
                curveTo(11.25f, 9.59f, 11.59f, 9.25f, 12f, 9.25f)
                curveTo(12.41f, 9.25f, 12.75f, 9.59f, 12.75f, 10f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 12.55f)
                curveTo(18.91f, 12.55f, 18.81f, 12.53f, 18.72f, 12.5f)
                lineTo(13.21f, 10.29f)
                curveTo(12.43f, 9.98f, 11.57f, 9.98f, 10.78f, 10.29f)
                lineTo(5.27f, 12.5f)
                curveTo(5.04f, 12.59f, 4.78f, 12.56f, 4.57f, 12.42f)
                curveTo(4.36f, 12.28f, 4.24f, 12.05f, 4.24f, 11.8f)
                verticalLineTo(8f)
                curveTo(4.24f, 5.93f, 5.92f, 4.25f, 7.99f, 4.25f)
                horizontalLineTo(15.99f)
                curveTo(18.06f, 4.25f, 19.74f, 5.93f, 19.74f, 8f)
                verticalLineTo(11.8f)
                curveTo(19.74f, 12.05f, 19.62f, 12.28f, 19.41f, 12.42f)
                curveTo(19.29f, 12.51f, 19.15f, 12.55f, 19f, 12.55f)
                close()
                moveTo(12f, 8.55f)
                curveTo(12.6f, 8.55f, 13.2f, 8.66f, 13.77f, 8.89f)
                lineTo(18.25f, 10.69f)
                verticalLineTo(8f)
                curveTo(18.25f, 6.76f, 17.24f, 5.75f, 16f, 5.75f)
                horizontalLineTo(8f)
                curveTo(6.76f, 5.75f, 5.75f, 6.76f, 5.75f, 8f)
                verticalLineTo(10.69f)
                lineTo(10.23f, 8.89f)
                curveTo(10.8f, 8.67f, 11.4f, 8.55f, 12f, 8.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 5.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 5.75f, 8.75f, 5.41f, 8.75f, 5f)
                verticalLineTo(3f)
                curveTo(8.75f, 2.04f, 9.54f, 1.25f, 10.5f, 1.25f)
                horizontalLineTo(13.5f)
                curveTo(14.46f, 1.25f, 15.25f, 2.04f, 15.25f, 3f)
                verticalLineTo(5f)
                curveTo(15.25f, 5.41f, 14.91f, 5.75f, 14.5f, 5.75f)
                close()
                moveTo(10.25f, 4.25f)
                horizontalLineTo(13.75f)
                verticalLineTo(3f)
                curveTo(13.75f, 2.86f, 13.64f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(10.5f)
                curveTo(10.36f, 2.75f, 10.25f, 2.86f, 10.25f, 3f)
                verticalLineTo(4.25f)
                close()
            }
        }.build()

        return _Ship!!
    }

@Suppress("ObjectPropertyName")
private var _Ship: ImageVector? = null
