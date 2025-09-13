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

val Iconsax.Outline.GalleryTick: ImageVector
    get() {
        if (_GalleryTick != null) {
            return _GalleryTick!!
        }
        _GalleryTick = ImageVector.Builder(
            name = "Outline.GalleryTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 10.75f)
                curveTo(7.48f, 10.75f, 6.25f, 9.52f, 6.25f, 8f)
                curveTo(6.25f, 6.48f, 7.48f, 5.25f, 9f, 5.25f)
                curveTo(10.52f, 5.25f, 11.75f, 6.48f, 11.75f, 8f)
                curveTo(11.75f, 9.52f, 10.52f, 10.75f, 9f, 10.75f)
                close()
                moveTo(9f, 6.75f)
                curveTo(8.31f, 6.75f, 7.75f, 7.31f, 7.75f, 8f)
                curveTo(7.75f, 8.69f, 8.31f, 9.25f, 9f, 9.25f)
                curveTo(9.69f, 9.25f, 10.25f, 8.69f, 10.25f, 8f)
                curveTo(10.25f, 7.31f, 9.69f, 6.75f, 9f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 1.25f, 13.75f, 1.59f, 13.75f, 2f)
                curveTo(13.75f, 2.41f, 13.41f, 2.75f, 13f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.459f, 7.2f)
                curveTo(17.27f, 7.2f, 17.08f, 7.13f, 16.93f, 6.98f)
                lineTo(15.469f, 5.52f)
                curveTo(15.179f, 5.23f, 15.179f, 4.75f, 15.469f, 4.46f)
                curveTo(15.759f, 4.17f, 16.24f, 4.17f, 16.529f, 4.46f)
                lineTo(17.459f, 5.39f)
                lineTo(20.83f, 2.02f)
                curveTo(21.119f, 1.73f, 21.6f, 1.73f, 21.889f, 2.02f)
                curveTo(22.18f, 2.31f, 22.18f, 2.79f, 21.889f, 3.08f)
                lineTo(17.99f, 6.98f)
                curveTo(17.85f, 7.13f, 17.649f, 7.2f, 17.459f, 7.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.671f, 19.7f)
                curveTo(2.431f, 19.7f, 2.191f, 19.58f, 2.051f, 19.37f)
                curveTo(1.821f, 19.03f, 1.911f, 18.56f, 2.261f, 18.33f)
                lineTo(7.191f, 15.02f)
                curveTo(8.271f, 14.29f, 9.761f, 14.38f, 10.741f, 15.21f)
                lineTo(11.071f, 15.5f)
                curveTo(11.571f, 15.93f, 12.421f, 15.93f, 12.911f, 15.5f)
                lineTo(17.071f, 11.93f)
                curveTo(18.131f, 11.02f, 19.801f, 11.02f, 20.871f, 11.93f)
                lineTo(22.501f, 13.33f)
                curveTo(22.811f, 13.6f, 22.851f, 14.07f, 22.581f, 14.39f)
                curveTo(22.311f, 14.7f, 21.841f, 14.74f, 21.521f, 14.47f)
                lineTo(19.891f, 13.07f)
                curveTo(19.391f, 12.64f, 18.541f, 12.64f, 18.041f, 13.07f)
                lineTo(13.881f, 16.64f)
                curveTo(12.821f, 17.55f, 11.151f, 17.55f, 10.081f, 16.64f)
                lineTo(9.751f, 16.35f)
                curveTo(9.291f, 15.96f, 8.531f, 15.92f, 8.021f, 16.27f)
                lineTo(3.091f, 19.58f)
                curveTo(2.961f, 19.66f, 2.811f, 19.7f, 2.671f, 19.7f)
                close()
            }
        }.build()

        return _GalleryTick!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryTick: ImageVector? = null
