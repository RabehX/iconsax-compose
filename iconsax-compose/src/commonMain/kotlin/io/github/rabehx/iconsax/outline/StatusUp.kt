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

val Iconsax.Outline.StatusUp: ImageVector
    get() {
        if (_StatusUp != null) {
            return _StatusUp!!
        }
        _StatusUp = ImageVector.Builder(
            name = "Outline.StatusUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.88f, 18.9f)
                curveTo(6.47f, 18.9f, 6.13f, 18.56f, 6.13f, 18.15f)
                verticalLineTo(16.08f)
                curveTo(6.13f, 15.67f, 6.47f, 15.33f, 6.88f, 15.33f)
                curveTo(7.29f, 15.33f, 7.63f, 15.67f, 7.63f, 16.08f)
                verticalLineTo(18.15f)
                curveTo(7.63f, 18.57f, 7.29f, 18.9f, 6.88f, 18.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.9f)
                curveTo(11.59f, 18.9f, 11.25f, 18.56f, 11.25f, 18.15f)
                verticalLineTo(14f)
                curveTo(11.25f, 13.59f, 11.59f, 13.25f, 12f, 13.25f)
                curveTo(12.41f, 13.25f, 12.75f, 13.59f, 12.75f, 14f)
                verticalLineTo(18.15f)
                curveTo(12.75f, 18.57f, 12.41f, 18.9f, 12f, 18.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.12f, 18.9f)
                curveTo(16.71f, 18.9f, 16.37f, 18.56f, 16.37f, 18.15f)
                verticalLineTo(11.93f)
                curveTo(16.37f, 11.52f, 16.71f, 11.18f, 17.12f, 11.18f)
                curveTo(17.53f, 11.18f, 17.87f, 11.52f, 17.87f, 11.93f)
                verticalLineTo(18.15f)
                curveTo(17.87f, 18.57f, 17.54f, 18.9f, 17.12f, 18.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.88f, 13.18f)
                curveTo(6.54f, 13.18f, 6.24f, 12.95f, 6.15f, 12.61f)
                curveTo(6.05f, 12.21f, 6.29f, 11.8f, 6.7f, 11.7f)
                curveTo(10.38f, 10.78f, 13.62f, 8.77f, 16.09f, 5.9f)
                lineTo(16.55f, 5.36f)
                curveTo(16.82f, 5.05f, 17.29f, 5.01f, 17.61f, 5.28f)
                curveTo(17.92f, 5.55f, 17.96f, 6.02f, 17.69f, 6.34f)
                lineTo(17.23f, 6.88f)
                curveTo(14.56f, 10f, 11.04f, 12.17f, 7.06f, 13.16f)
                curveTo(7f, 13.18f, 6.94f, 13.18f, 6.88f, 13.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.12f, 9.52f)
                curveTo(16.71f, 9.52f, 16.37f, 9.18f, 16.37f, 8.77f)
                verticalLineTo(6.6f)
                horizontalLineTo(14.19f)
                curveTo(13.78f, 6.6f, 13.44f, 6.26f, 13.44f, 5.85f)
                curveTo(13.44f, 5.44f, 13.78f, 5.1f, 14.19f, 5.1f)
                horizontalLineTo(17.12f)
                curveTo(17.53f, 5.1f, 17.87f, 5.44f, 17.87f, 5.85f)
                verticalLineTo(8.78f)
                curveTo(17.87f, 9.19f, 17.54f, 9.52f, 17.12f, 9.52f)
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

        return _StatusUp!!
    }

@Suppress("ObjectPropertyName")
private var _StatusUp: ImageVector? = null
