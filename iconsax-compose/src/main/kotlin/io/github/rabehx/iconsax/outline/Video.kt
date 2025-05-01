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

val Iconsax.Outline.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Outline.Video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.88f, 20.86f)
                horizontalLineTo(6.81f)
                curveTo(3.26f, 20.86f, 2f, 18.37f, 2f, 16.05f)
                verticalLineTo(7.95f)
                curveTo(2f, 4.49f, 3.35f, 3.14f, 6.81f, 3.14f)
                horizontalLineTo(12.88f)
                curveTo(16.34f, 3.14f, 17.69f, 4.49f, 17.69f, 7.95f)
                verticalLineTo(16.05f)
                curveTo(17.69f, 19.51f, 16.34f, 20.86f, 12.88f, 20.86f)
                close()
                moveTo(6.81f, 4.66f)
                curveTo(4.2f, 4.66f, 3.52f, 5.34f, 3.52f, 7.95f)
                verticalLineTo(16.05f)
                curveTo(3.52f, 17.28f, 3.95f, 19.34f, 6.81f, 19.34f)
                horizontalLineTo(12.88f)
                curveTo(15.49f, 19.34f, 16.17f, 18.66f, 16.17f, 16.05f)
                verticalLineTo(7.95f)
                curveTo(16.17f, 5.34f, 15.49f, 4.66f, 12.88f, 4.66f)
                horizontalLineTo(6.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.78f, 18.11f)
                curveTo(20.35f, 18.11f, 19.8f, 17.97f, 19.17f, 17.53f)
                lineTo(16.5f, 15.66f)
                curveTo(16.3f, 15.52f, 16.18f, 15.29f, 16.18f, 15.04f)
                verticalLineTo(8.96f)
                curveTo(16.18f, 8.71f, 16.3f, 8.48f, 16.5f, 8.34f)
                lineTo(19.17f, 6.47f)
                curveTo(20.36f, 5.64f, 21.23f, 5.88f, 21.64f, 6.09f)
                curveTo(22.05f, 6.31f, 22.75f, 6.88f, 22.75f, 8.33f)
                verticalLineTo(15.66f)
                curveTo(22.75f, 17.11f, 22.05f, 17.69f, 21.64f, 17.9f)
                curveTo(21.45f, 18.01f, 21.15f, 18.11f, 20.78f, 18.11f)
                close()
                moveTo(17.69f, 14.64f)
                lineTo(20.04f, 16.28f)
                curveTo(20.49f, 16.59f, 20.81f, 16.62f, 20.94f, 16.55f)
                curveTo(21.08f, 16.48f, 21.23f, 16.2f, 21.23f, 15.66f)
                verticalLineTo(8.34f)
                curveTo(21.23f, 7.79f, 21.07f, 7.52f, 20.94f, 7.45f)
                curveTo(20.81f, 7.38f, 20.49f, 7.41f, 20.04f, 7.72f)
                lineTo(17.69f, 9.36f)
                verticalLineTo(14.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 11.75f)
                curveTo(10.26f, 11.75f, 9.25f, 10.74f, 9.25f, 9.5f)
                curveTo(9.25f, 8.26f, 10.26f, 7.25f, 11.5f, 7.25f)
                curveTo(12.74f, 7.25f, 13.75f, 8.26f, 13.75f, 9.5f)
                curveTo(13.75f, 10.74f, 12.74f, 11.75f, 11.5f, 11.75f)
                close()
                moveTo(11.5f, 8.75f)
                curveTo(11.09f, 8.75f, 10.75f, 9.09f, 10.75f, 9.5f)
                curveTo(10.75f, 9.91f, 11.09f, 10.25f, 11.5f, 10.25f)
                curveTo(11.91f, 10.25f, 12.25f, 9.91f, 12.25f, 9.5f)
                curveTo(12.25f, 9.09f, 11.91f, 8.75f, 11.5f, 8.75f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
