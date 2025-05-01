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

val Iconsax.Outline.ArchiveAdd: ImageVector
    get() {
        if (_ArchiveAdd != null) {
            return _ArchiveAdd!!
        }
        _ArchiveAdd = ImageVector.Builder(
            name = "Outline.ArchiveAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 11.4f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 11.4f, 8.75f, 11.06f, 8.75f, 10.65f)
                curveTo(8.75f, 10.24f, 9.09f, 9.9f, 9.5f, 9.9f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 9.9f, 15.25f, 10.24f, 15.25f, 10.65f)
                curveTo(15.25f, 11.06f, 14.91f, 11.4f, 14.5f, 11.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.96f)
                curveTo(11.59f, 13.96f, 11.25f, 13.62f, 11.25f, 13.21f)
                verticalLineTo(8.21f)
                curveTo(11.25f, 7.8f, 11.59f, 7.46f, 12f, 7.46f)
                curveTo(12.41f, 7.46f, 12.75f, 7.8f, 12.75f, 8.21f)
                verticalLineTo(13.21f)
                curveTo(12.75f, 13.62f, 12.41f, 13.96f, 12f, 13.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.07f, 22.75f)
                curveTo(18.56f, 22.75f, 18f, 22.6f, 17.46f, 22.29f)
                lineTo(12.58f, 19.58f)
                curveTo(12.29f, 19.42f, 11.72f, 19.42f, 11.43f, 19.58f)
                lineTo(6.55f, 22.29f)
                curveTo(5.56f, 22.84f, 4.55f, 22.9f, 3.78f, 22.44f)
                curveTo(3.01f, 21.99f, 2.57f, 21.08f, 2.57f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(2.57f, 3.32f, 4.64f, 1.25f, 7.18f, 1.25f)
                horizontalLineTo(16.83f)
                curveTo(19.37f, 1.25f, 21.44f, 3.32f, 21.44f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(21.44f, 21.08f, 21f, 21.99f, 20.23f, 22.44f)
                curveTo(19.88f, 22.65f, 19.48f, 22.75f, 19.07f, 22.75f)
                close()
                moveTo(12f, 17.96f)
                curveTo(12.47f, 17.96f, 12.93f, 18.06f, 13.3f, 18.27f)
                lineTo(18.18f, 20.98f)
                curveTo(18.69f, 21.27f, 19.16f, 21.33f, 19.46f, 21.15f)
                curveTo(19.76f, 20.97f, 19.93f, 20.54f, 19.93f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(19.93f, 4.15f, 18.53f, 2.75f, 16.82f, 2.75f)
                horizontalLineTo(7.18f)
                curveTo(5.47f, 2.75f, 4.07f, 4.15f, 4.07f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(4.07f, 20.54f, 4.24f, 20.98f, 4.54f, 21.15f)
                curveTo(4.84f, 21.32f, 5.31f, 21.27f, 5.82f, 20.98f)
                lineTo(10.7f, 18.27f)
                curveTo(11.07f, 18.06f, 11.53f, 17.96f, 12f, 17.96f)
                close()
            }
        }.build()

        return _ArchiveAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveAdd: ImageVector? = null
