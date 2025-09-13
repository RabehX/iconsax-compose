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

val Iconsax.Outline.Signpost: ImageVector
    get() {
        if (_Signpost != null) {
            return _Signpost!!
        }
        _Signpost = ImageVector.Builder(
            name = "Outline.Signpost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.219f, 9.75f)
                horizontalLineTo(8.96f)
                curveTo(8.4f, 9.75f, 7.84f, 9.56f, 7.4f, 9.2f)
                lineTo(5.21f, 7.45f)
                curveTo(4.61f, 6.97f, 4.27f, 6.26f, 4.27f, 5.5f)
                curveTo(4.27f, 4.74f, 4.61f, 4.02f, 5.21f, 3.55f)
                lineTo(7.4f, 1.8f)
                curveTo(7.84f, 1.45f, 8.4f, 1.25f, 8.96f, 1.25f)
                horizontalLineTo(17.219f)
                curveTo(18.6f, 1.25f, 19.719f, 2.37f, 19.719f, 3.75f)
                verticalLineTo(7.25f)
                curveTo(19.719f, 8.63f, 18.6f, 9.75f, 17.219f, 9.75f)
                close()
                moveTo(8.96f, 2.75f)
                curveTo(8.73f, 2.75f, 8.51f, 2.83f, 8.34f, 2.97f)
                lineTo(6.15f, 4.72f)
                curveTo(5.91f, 4.91f, 5.77f, 5.2f, 5.77f, 5.5f)
                curveTo(5.77f, 5.8f, 5.91f, 6.09f, 6.15f, 6.28f)
                lineTo(8.34f, 8.03f)
                curveTo(8.52f, 8.17f, 8.74f, 8.25f, 8.96f, 8.25f)
                horizontalLineTo(17.219f)
                curveTo(17.77f, 8.25f, 18.219f, 7.8f, 18.219f, 7.25f)
                verticalLineTo(3.75f)
                curveTo(18.219f, 3.2f, 17.77f, 2.75f, 17.219f, 2.75f)
                horizontalLineTo(8.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.061f, 19.75f)
                horizontalLineTo(6.801f)
                curveTo(5.421f, 19.75f, 4.301f, 18.63f, 4.301f, 17.25f)
                verticalLineTo(13.75f)
                curveTo(4.301f, 12.37f, 5.421f, 11.25f, 6.801f, 11.25f)
                horizontalLineTo(15.061f)
                curveTo(15.631f, 11.25f, 16.181f, 11.44f, 16.621f, 11.8f)
                lineTo(18.811f, 13.55f)
                curveTo(19.411f, 14.03f, 19.751f, 14.74f, 19.751f, 15.5f)
                curveTo(19.751f, 16.26f, 19.411f, 16.98f, 18.811f, 17.45f)
                lineTo(16.621f, 19.2f)
                curveTo(16.181f, 19.56f, 15.631f, 19.75f, 15.061f, 19.75f)
                close()
                moveTo(6.801f, 12.75f)
                curveTo(6.251f, 12.75f, 5.801f, 13.2f, 5.801f, 13.75f)
                verticalLineTo(17.25f)
                curveTo(5.801f, 17.8f, 6.251f, 18.25f, 6.801f, 18.25f)
                horizontalLineTo(15.061f)
                curveTo(15.291f, 18.25f, 15.511f, 18.17f, 15.681f, 18.03f)
                lineTo(17.871f, 16.28f)
                curveTo(18.111f, 16.09f, 18.251f, 15.8f, 18.251f, 15.5f)
                curveTo(18.251f, 15.2f, 18.111f, 14.91f, 17.871f, 14.72f)
                lineTo(15.681f, 12.97f)
                curveTo(15.501f, 12.83f, 15.281f, 12.75f, 15.061f, 12.75f)
                horizontalLineTo(6.801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.75f)
                curveTo(11.59f, 12.75f, 11.25f, 12.41f, 11.25f, 12f)
                verticalLineTo(9f)
                curveTo(11.25f, 8.59f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                verticalLineTo(12f)
                curveTo(12.75f, 12.41f, 12.41f, 12.75f, 12f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(19f)
                curveTo(11.25f, 18.59f, 11.59f, 18.25f, 12f, 18.25f)
                curveTo(12.41f, 18.25f, 12.75f, 18.59f, 12.75f, 19f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 22.75f, 8.25f, 22.41f, 8.25f, 22f)
                curveTo(8.25f, 21.59f, 8.59f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 21.25f, 15.75f, 21.59f, 15.75f, 22f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _Signpost!!
    }

@Suppress("ObjectPropertyName")
private var _Signpost: ImageVector? = null
