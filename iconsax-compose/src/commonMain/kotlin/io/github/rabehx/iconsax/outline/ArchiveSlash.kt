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

val Iconsax.Outline.ArchiveSlash: ImageVector
    get() {
        if (_ArchiveSlash != null) {
            return _ArchiveSlash!!
        }
        _ArchiveSlash = ImageVector.Builder(
            name = "Outline.ArchiveSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 22.75f)
                curveTo(1.81f, 22.75f, 1.62f, 22.68f, 1.47f, 22.53f)
                curveTo(1.18f, 22.24f, 1.18f, 21.76f, 1.47f, 21.47f)
                lineTo(21.47f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.53f, 1.47f)
                curveTo(22.82f, 1.76f, 22.82f, 2.24f, 22.53f, 2.53f)
                lineTo(2.53f, 22.53f)
                curveTo(2.38f, 22.68f, 2.19f, 22.75f, 2f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.88f, 22.75f)
                curveTo(18.32f, 22.75f, 17.72f, 22.58f, 17.12f, 22.25f)
                lineTo(10.6f, 18.18f)
                curveTo(10.25f, 17.96f, 10.14f, 17.5f, 10.36f, 17.15f)
                curveTo(10.58f, 16.8f, 11.04f, 16.69f, 11.39f, 16.91f)
                lineTo(17.88f, 20.96f)
                curveTo(18.44f, 21.27f, 19f, 21.34f, 19.36f, 21.13f)
                curveTo(19.72f, 20.92f, 19.93f, 20.4f, 19.93f, 19.71f)
                verticalLineTo(8.71f)
                curveTo(19.93f, 8.3f, 20.27f, 7.96f, 20.68f, 7.96f)
                curveTo(21.09f, 7.96f, 21.43f, 8.3f, 21.43f, 8.71f)
                verticalLineTo(19.71f)
                curveTo(21.43f, 20.94f, 20.95f, 21.93f, 20.12f, 22.42f)
                curveTo(19.75f, 22.64f, 19.33f, 22.75f, 18.88f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.32f, 20.7f)
                curveTo(2.91f, 20.7f, 2.57f, 20.36f, 2.57f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(2.57f, 3.32f, 4.64f, 1.25f, 7.18f, 1.25f)
                horizontalLineTo(16.83f)
                curveTo(18.22f, 1.25f, 19.53f, 1.87f, 20.41f, 2.96f)
                curveTo(20.67f, 3.28f, 20.62f, 3.75f, 20.3f, 4.02f)
                curveTo(19.98f, 4.28f, 19.51f, 4.23f, 19.25f, 3.91f)
                curveTo(18.65f, 3.17f, 17.77f, 2.75f, 16.83f, 2.75f)
                horizontalLineTo(7.18f)
                curveTo(5.47f, 2.75f, 4.07f, 4.15f, 4.07f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(4.07f, 20.36f, 3.73f, 20.7f, 3.32f, 20.7f)
                close()
            }
        }.build()

        return _ArchiveSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSlash: ImageVector? = null
