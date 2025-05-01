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

val Iconsax.Outline.HomeHashtag: ImageVector
    get() {
        if (_HomeHashtag != null) {
            return _HomeHashtag!!
        }
        _HomeHashtag = ImageVector.Builder(
            name = "Outline.HomeHashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.79f, 22.74f)
                horizontalLineTo(6.21f)
                curveTo(3.47f, 22.74f, 1.25f, 20.51f, 1.25f, 17.77f)
                verticalLineTo(10.36f)
                curveTo(1.25f, 9f, 2.09f, 7.29f, 3.17f, 6.45f)
                lineTo(8.56f, 2.25f)
                curveTo(10.18f, 0.99f, 12.77f, 0.93f, 14.45f, 2.11f)
                lineTo(20.63f, 6.44f)
                curveTo(21.82f, 7.27f, 22.75f, 9.05f, 22.75f, 10.5f)
                verticalLineTo(17.78f)
                curveTo(22.75f, 20.51f, 20.53f, 22.74f, 17.79f, 22.74f)
                close()
                moveTo(9.48f, 3.43f)
                lineTo(4.09f, 7.63f)
                curveTo(3.38f, 8.19f, 2.75f, 9.46f, 2.75f, 10.36f)
                verticalLineTo(17.77f)
                curveTo(2.75f, 19.68f, 4.3f, 21.24f, 6.21f, 21.24f)
                horizontalLineTo(17.79f)
                curveTo(19.7f, 21.24f, 21.25f, 19.69f, 21.25f, 17.78f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 9.54f, 20.56f, 8.21f, 19.77f, 7.67f)
                lineTo(13.59f, 3.34f)
                curveTo(12.45f, 2.54f, 10.57f, 2.58f, 9.48f, 3.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 18.75f)
                horizontalLineTo(10.5f)
                curveTo(8.43f, 18.75f, 6.75f, 17.07f, 6.75f, 15f)
                verticalLineTo(12f)
                curveTo(6.75f, 9.93f, 8.43f, 8.25f, 10.5f, 8.25f)
                horizontalLineTo(13.5f)
                curveTo(15.57f, 8.25f, 17.25f, 9.93f, 17.25f, 12f)
                verticalLineTo(15f)
                curveTo(17.25f, 17.07f, 15.57f, 18.75f, 13.5f, 18.75f)
                close()
                moveTo(10.5f, 9.75f)
                curveTo(9.26f, 9.75f, 8.25f, 10.76f, 8.25f, 12f)
                verticalLineTo(15f)
                curveTo(8.25f, 16.24f, 9.26f, 17.25f, 10.5f, 17.25f)
                horizontalLineTo(13.5f)
                curveTo(14.74f, 17.25f, 15.75f, 16.24f, 15.75f, 15f)
                verticalLineTo(12f)
                curveTo(15.75f, 10.76f, 14.74f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(9f)
                curveTo(11.25f, 8.59f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 14.25f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 14.25f, 6.75f, 13.91f, 6.75f, 13.5f)
                curveTo(6.75f, 13.09f, 7.09f, 12.75f, 7.5f, 12.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 12.75f, 17.25f, 13.09f, 17.25f, 13.5f)
                curveTo(17.25f, 13.91f, 16.91f, 14.25f, 16.5f, 14.25f)
                close()
            }
        }.build()

        return _HomeHashtag!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHashtag: ImageVector? = null
