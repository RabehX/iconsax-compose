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

val Iconsax.Outline.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Outline.Like",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.3f, 22.75f, 10.59f, 22.48f, 10.06f, 21.95f)
                lineTo(8.35f, 20.26f)
                curveTo(7.93f, 19.84f, 7.35f, 19.61f, 6.76f, 19.61f)
                horizontalLineTo(6f)
                curveTo(3.93f, 19.61f, 2.25f, 17.94f, 2.25f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(2.25f, 2.93f, 3.93f, 1.26f, 6f, 1.26f)
                horizontalLineTo(18f)
                curveTo(20.07f, 1.26f, 21.75f, 2.93f, 21.75f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.75f, 17.94f, 20.07f, 19.61f, 18f, 19.61f)
                horizontalLineTo(17.24f)
                curveTo(16.65f, 19.61f, 16.07f, 19.85f, 15.65f, 20.26f)
                lineTo(13.94f, 21.95f)
                curveTo(13.41f, 22.48f, 12.7f, 22.75f, 12f, 22.75f)
                close()
                moveTo(6f, 2.75f)
                curveTo(4.76f, 2.75f, 3.75f, 3.75f, 3.75f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.75f, 17.11f, 4.76f, 18.1f, 6f, 18.1f)
                horizontalLineTo(6.76f)
                curveTo(7.75f, 18.1f, 8.71f, 18.5f, 9.41f, 19.19f)
                lineTo(11.12f, 20.88f)
                curveTo(11.61f, 21.36f, 12.4f, 21.36f, 12.89f, 20.88f)
                lineTo(14.6f, 19.19f)
                curveTo(15.3f, 18.5f, 16.26f, 18.1f, 17.25f, 18.1f)
                horizontalLineTo(18f)
                curveTo(19.24f, 18.1f, 20.25f, 17.1f, 20.25f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(20.25f, 3.74f, 19.24f, 2.75f, 18f, 2.75f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(11.82f, 15.75f, 11.64f, 15.72f, 11.48f, 15.67f)
                curveTo(10.16f, 15.22f, 6.76f, 13.23f, 6.76f, 9.51f)
                curveTo(6.76f, 7.71f, 8.22f, 6.25f, 10.01f, 6.25f)
                curveTo(10.74f, 6.25f, 11.44f, 6.5f, 12.01f, 6.94f)
                curveTo(12.58f, 6.5f, 13.28f, 6.25f, 14.01f, 6.25f)
                curveTo(15.8f, 6.25f, 17.26f, 7.71f, 17.26f, 9.51f)
                curveTo(17.26f, 13.23f, 13.85f, 15.22f, 12.54f, 15.67f)
                curveTo(12.36f, 15.72f, 12.18f, 15.75f, 12f, 15.75f)
                close()
                moveTo(10f, 7.75f)
                curveTo(9.04f, 7.75f, 8.25f, 8.54f, 8.25f, 9.51f)
                curveTo(8.25f, 12.34f, 11f, 13.92f, 11.96f, 14.25f)
                curveTo(11.97f, 14.25f, 12.01f, 14.25f, 12.04f, 14.25f)
                curveTo(13.01f, 13.91f, 15.74f, 12.33f, 15.74f, 9.52f)
                curveTo(15.74f, 8.55f, 14.96f, 7.76f, 13.99f, 7.76f)
                curveTo(13.44f, 7.76f, 12.93f, 8.02f, 12.59f, 8.46f)
                curveTo(12.31f, 8.84f, 11.67f, 8.84f, 11.39f, 8.46f)
                curveTo(11.07f, 8.01f, 10.56f, 7.75f, 10f, 7.75f)
                close()
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
