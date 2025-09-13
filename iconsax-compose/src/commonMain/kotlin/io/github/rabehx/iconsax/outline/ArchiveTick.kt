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

val Iconsax.Outline.ArchiveTick: ImageVector
    get() {
        if (_ArchiveTick != null) {
            return _ArchiveTick!!
        }
        _ArchiveTick = ImageVector.Builder(
            name = "Outline.ArchiveTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.93f, 22.75f)
                curveTo(4.51f, 22.75f, 4.12f, 22.65f, 3.77f, 22.45f)
                curveTo(3f, 22f, 2.56f, 21.09f, 2.56f, 19.96f)
                verticalLineTo(5.86f)
                curveTo(2.56f, 3.32f, 4.63f, 1.25f, 7.17f, 1.25f)
                horizontalLineTo(16.82f)
                curveTo(19.36f, 1.25f, 21.43f, 3.32f, 21.43f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(21.43f, 21.08f, 20.99f, 21.99f, 20.22f, 22.44f)
                curveTo(19.45f, 22.89f, 18.44f, 22.84f, 17.45f, 22.29f)
                lineTo(12.57f, 19.58f)
                curveTo(12.28f, 19.42f, 11.71f, 19.42f, 11.42f, 19.58f)
                lineTo(6.54f, 22.29f)
                curveTo(6f, 22.59f, 5.45f, 22.75f, 4.93f, 22.75f)
                close()
                moveTo(7.18f, 2.75f)
                curveTo(5.47f, 2.75f, 4.07f, 4.15f, 4.07f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(4.07f, 20.54f, 4.24f, 20.98f, 4.54f, 21.15f)
                curveTo(4.84f, 21.32f, 5.31f, 21.27f, 5.82f, 20.98f)
                lineTo(10.7f, 18.27f)
                curveTo(11.44f, 17.86f, 12.56f, 17.86f, 13.3f, 18.27f)
                lineTo(18.18f, 20.98f)
                curveTo(18.69f, 21.27f, 19.16f, 21.33f, 19.46f, 21.15f)
                curveTo(19.76f, 20.97f, 19.93f, 20.53f, 19.93f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(19.93f, 4.15f, 18.53f, 2.75f, 16.82f, 2.75f)
                horizontalLineTo(7.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.09f, 13.25f)
                curveTo(10.9f, 13.25f, 10.71f, 13.18f, 10.56f, 13.03f)
                lineTo(9.06f, 11.53f)
                curveTo(8.77f, 11.24f, 8.77f, 10.76f, 9.06f, 10.47f)
                curveTo(9.35f, 10.18f, 9.83f, 10.18f, 10.12f, 10.47f)
                lineTo(11.09f, 11.44f)
                lineTo(14.56f, 7.97f)
                curveTo(14.85f, 7.68f, 15.33f, 7.68f, 15.62f, 7.97f)
                curveTo(15.91f, 8.26f, 15.91f, 8.74f, 15.62f, 9.03f)
                lineTo(11.62f, 13.03f)
                curveTo(11.47f, 13.18f, 11.28f, 13.25f, 11.09f, 13.25f)
                close()
            }
        }.build()

        return _ArchiveTick!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveTick: ImageVector? = null
