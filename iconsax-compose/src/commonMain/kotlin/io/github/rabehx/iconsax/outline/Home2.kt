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

val Iconsax.Outline.Home2: ImageVector
    get() {
        if (_Home2 != null) {
            return _Home2!!
        }
        _Home2 = ImageVector.Builder(
            name = "Outline.Home2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.79f, 22.75f)
                horizontalLineTo(6.21f)
                curveTo(3.47f, 22.75f, 1.25f, 20.52f, 1.25f, 17.78f)
                verticalLineTo(10.37f)
                curveTo(1.25f, 9.01f, 2.09f, 7.3f, 3.17f, 6.46f)
                lineTo(8.56f, 2.26f)
                curveTo(10.18f, 1f, 12.77f, 0.94f, 14.45f, 2.12f)
                lineTo(20.63f, 6.45f)
                curveTo(21.82f, 7.28f, 22.75f, 9.06f, 22.75f, 10.51f)
                verticalLineTo(17.79f)
                curveTo(22.75f, 20.52f, 20.53f, 22.75f, 17.79f, 22.75f)
                close()
                moveTo(9.48f, 3.44f)
                lineTo(4.09f, 7.64f)
                curveTo(3.38f, 8.2f, 2.75f, 9.47f, 2.75f, 10.37f)
                verticalLineTo(17.78f)
                curveTo(2.75f, 19.69f, 4.3f, 21.25f, 6.21f, 21.25f)
                horizontalLineTo(17.79f)
                curveTo(19.7f, 21.25f, 21.25f, 19.7f, 21.25f, 17.79f)
                verticalLineTo(10.51f)
                curveTo(21.25f, 9.55f, 20.56f, 8.22f, 19.77f, 7.68f)
                lineTo(13.59f, 3.35f)
                curveTo(12.45f, 2.55f, 10.57f, 2.59f, 9.48f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(15f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
        }.build()

        return _Home2!!
    }

@Suppress("ObjectPropertyName")
private var _Home2: ImageVector? = null
