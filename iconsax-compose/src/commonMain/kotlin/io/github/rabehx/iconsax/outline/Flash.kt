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

val Iconsax.Outline.Flash: ImageVector
    get() {
        if (_Flash != null) {
            return _Flash!!
        }
        _Flash = ImageVector.Builder(
            name = "Outline.Flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.57f, 22.38f)
                curveTo(13.34f, 22.38f, 13.11f, 22.34f, 12.89f, 22.26f)
                curveTo(12.14f, 21.98f, 11.66f, 21.28f, 11.66f, 20.48f)
                verticalLineTo(14.03f)
                horizontalLineTo(9.32f)
                curveTo(8.56f, 14.03f, 7.9f, 13.6f, 7.59f, 12.91f)
                curveTo(7.28f, 12.22f, 7.4f, 11.44f, 7.9f, 10.87f)
                lineTo(15.47f, 2.27f)
                curveTo(16f, 1.67f, 16.82f, 1.46f, 17.57f, 1.75f)
                curveTo(18.32f, 2.03f, 18.8f, 2.73f, 18.8f, 3.53f)
                verticalLineTo(9.98f)
                horizontalLineTo(21.14f)
                curveTo(21.9f, 9.98f, 22.56f, 10.41f, 22.87f, 11.1f)
                curveTo(23.18f, 11.79f, 23.06f, 12.57f, 22.56f, 13.14f)
                lineTo(14.99f, 21.74f)
                curveTo(14.62f, 22.16f, 14.1f, 22.38f, 13.57f, 22.38f)
                close()
                moveTo(16.88f, 3.12f)
                curveTo(16.79f, 3.12f, 16.68f, 3.15f, 16.59f, 3.26f)
                lineTo(9.02f, 11.87f)
                curveTo(8.86f, 12.05f, 8.92f, 12.23f, 8.95f, 12.3f)
                curveTo(8.98f, 12.37f, 9.08f, 12.54f, 9.32f, 12.54f)
                horizontalLineTo(12.41f)
                curveTo(12.82f, 12.54f, 13.16f, 12.88f, 13.16f, 13.29f)
                verticalLineTo(20.49f)
                curveTo(13.16f, 20.74f, 13.34f, 20.84f, 13.42f, 20.87f)
                curveTo(13.5f, 20.9f, 13.7f, 20.95f, 13.86f, 20.76f)
                lineTo(21.43f, 12.15f)
                curveTo(21.59f, 11.97f, 21.53f, 11.79f, 21.5f, 11.72f)
                curveTo(21.47f, 11.65f, 21.37f, 11.48f, 21.13f, 11.48f)
                horizontalLineTo(18.04f)
                curveTo(17.63f, 11.48f, 17.29f, 11.14f, 17.29f, 10.73f)
                verticalLineTo(3.53f)
                curveTo(17.29f, 3.28f, 17.11f, 3.18f, 17.03f, 3.15f)
                curveTo(17f, 3.13f, 16.94f, 3.12f, 16.88f, 3.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 4.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 4.75f, 0.75f, 4.41f, 0.75f, 4f)
                curveTo(0.75f, 3.59f, 1.09f, 3.25f, 1.5f, 3.25f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 3.25f, 9.25f, 3.59f, 9.25f, 4f)
                curveTo(9.25f, 4.41f, 8.91f, 4.75f, 8.5f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 20.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 20.75f, 0.75f, 20.41f, 0.75f, 20f)
                curveTo(0.75f, 19.59f, 1.09f, 19.25f, 1.5f, 19.25f)
                horizontalLineTo(7.5f)
                curveTo(7.91f, 19.25f, 8.25f, 19.59f, 8.25f, 20f)
                curveTo(8.25f, 20.41f, 7.91f, 20.75f, 7.5f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 12.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 12.75f, 0.75f, 12.41f, 0.75f, 12f)
                curveTo(0.75f, 11.59f, 1.09f, 11.25f, 1.5f, 11.25f)
                horizontalLineTo(4.5f)
                curveTo(4.91f, 11.25f, 5.25f, 11.59f, 5.25f, 12f)
                curveTo(5.25f, 12.41f, 4.91f, 12.75f, 4.5f, 12.75f)
                close()
            }
        }.build()

        return _Flash!!
    }

@Suppress("ObjectPropertyName")
private var _Flash: ImageVector? = null
